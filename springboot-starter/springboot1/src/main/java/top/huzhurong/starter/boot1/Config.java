package top.huzhurong.starter.boot1;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/29
 */
@Configuration
@ConditionalOnSpringBoot1
public class Config {

    @Bean
    public EmbeddedServletContainerCustomizer pojo() {
        return container -> {
            if (container instanceof TomcatEmbeddedServletContainerFactory) {
                ((TomcatEmbeddedServletContainerFactory) container).addContextCustomizers(
                        (TomcatContextCustomizer) context -> context.addLifecycleListener(event -> {
                            System.out.println("==========SpringBoot 1.x load Success!=============\t" + event.getType());
                        }));
            }

        };
    }

}