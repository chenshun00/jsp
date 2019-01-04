package top.huzhurong.boot.feature.servlet.bean;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@Slf4j
public class ListenerBean implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("ListenerBean init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
