package top.huzhurong.starter.boot2;

import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/29
 */
@Configuration
@ConditionalOnSpringBoot2
public class Config {

    @Bean
    public WebServerFactoryCustomizer _webServerFactory() {
        return (WebServerFactoryCustomizer<WebServerFactory>) factory -> {
            if (factory instanceof TomcatServletWebServerFactory) {
                TomcatServletWebServerFactory tomcatServletWebServerFactory = (TomcatServletWebServerFactory) factory;
                tomcatServletWebServerFactory.addContextCustomizers(
                        (TomcatContextCustomizer) context -> context.addLifecycleListener(event -> {
                            //servlet 容器的声明周期 会调用多次
                            System.out.println("==========SpringBoot 2.x load Success!=============\t" + event.getType());
                        }));
            } else {
                throw new RuntimeException("what , not support container!");
            }
        };
    }

}
