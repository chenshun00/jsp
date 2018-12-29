package top.huzhurong.starter.boot2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/24
 */
@ConditionalOnClass(name = "org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory")
public @interface ConditionalOnSpringBoot2 {
}
