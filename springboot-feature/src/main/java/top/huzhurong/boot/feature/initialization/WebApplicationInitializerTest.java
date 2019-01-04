package top.huzhurong.boot.feature.initialization;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * 添加一些信息，一定要注意这里是添加到servlet上，不是filter和listener
 * 并且是添加到 {@link DispatcherServlet}
 *
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@Service
public class WebApplicationInitializerTest implements ServletContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("nihao", "yes");
    }
}
