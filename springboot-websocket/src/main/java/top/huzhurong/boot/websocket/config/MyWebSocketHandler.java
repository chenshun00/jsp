package top.huzhurong.boot.websocket.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/30
 */
@Slf4j
public class MyWebSocketHandler implements WebSocketHandler {

    public static final Map<Long, WebSocketSession> userSocketSessionMap = new ConcurrentHashMap<>(16);

    /**
     * 建立连接后
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        //Long uid = (Long) session.getAttributes().get("uid");
        Long uid = 1L;
        userSocketSessionMap.putIfAbsent(uid, session);
    }

    /**
     * 消息处理，在客户端通过Websocket API发送的消息会经过这里，然后进行相应的处理
     */
    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> message) throws Exception {
        log.info("web socket message:[{}]", message.getPayload());
    }

    /**
     * 消息传输错误处理
     */
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if (session.isOpen()) {
            session.close();
        }
        Iterator<Map.Entry<Long, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
        // 移除Socket会话
        while (it.hasNext()) {
            Map.Entry<Long, WebSocketSession> entry = it.next();
            if (entry.getValue().getId().equals(session.getId())) {
                userSocketSessionMap.remove(entry.getKey());
                log.info("Socket会话已经移除,[{}]", entry.getKey());
                break;
            }
        }
    }


    /**
     * 关闭连接后
     */
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        System.out.println("Websocket:" + session.getId() + "已经关闭");
        Iterator<Map.Entry<Long, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
        // 移除Socket会话
        while (it.hasNext()) {
            Map.Entry<Long, WebSocketSession> entry = it.next();
            if (entry.getValue().getId().equals(session.getId())) {
                userSocketSessionMap.remove(entry.getKey());
                System.out.println("Socket会话已经移除:用户ID" + entry.getKey());
                break;
            }
        }
    }

    public boolean supportsPartialMessages() {
        return false;
    }

    public void sendMessageToUser(Long uid, TextMessage message) throws IOException {
        WebSocketSession session = userSocketSessionMap.get(uid);
        if (session != null && session.isOpen()) {
            session.sendMessage(message);
        }
    }

}
