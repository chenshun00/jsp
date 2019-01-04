package top.huzhurong.boot.feature.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@Slf4j
@WebListener
public class TestListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("init TestListener:" + TestListener.class.getClassLoader());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
