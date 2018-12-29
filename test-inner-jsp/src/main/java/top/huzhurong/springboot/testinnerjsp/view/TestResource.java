package top.huzhurong.springboot.testinnerjsp.view;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这里的导入还是需要一定的问题的，如果是Spring1.5的,那么是没有问题的，如果是Spring2.0，那么就是有问题的
 *
 * @author chenshun00@gmail.com
 * @since 2018/12/21
 */
@Configuration
@ConditionalOnProperty(name = "tomcat.staticResourceCustomizer.enabled", matchIfMissing = true)
public class TestResource {
    @Bean
    public TomcatServletWebServerFactory staticResourceCustomizer() {
        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.addContextCustomizers((TomcatContextCustomizer) context
                -> context.addLifecycleListener(new ResourceConfigurer(context)));
        return tomcatServletWebServerFactory;
    }
}
