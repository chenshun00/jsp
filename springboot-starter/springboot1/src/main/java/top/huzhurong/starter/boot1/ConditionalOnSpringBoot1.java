package top.huzhurong.starter.boot1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/24
 */
@ConditionalOnClass(name = "org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer")
public @interface ConditionalOnSpringBoot1 {
}
