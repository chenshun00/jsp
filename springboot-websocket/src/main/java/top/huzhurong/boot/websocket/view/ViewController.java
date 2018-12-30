package top.huzhurong.boot.websocket.view;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import top.huzhurong.boot.websocket.config.MyWebSocketHandler;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Random;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/30
 */
@RestController
@Slf4j
public class ViewController {

    @Resource
    private MyWebSocketHandler ws;

    @GetMapping("test")
    @ResponseBody
    public Object receive() {
        try {
            ws.sendMessageToUser(1L, new TextMessage(String.valueOf(new Random().nextInt() * 100) + "--chen "));
        } catch (IOException ex) {
            log.error("send web socket message error:" + ex.getMessage(), ex);
        }
        return "1";
    }

}
