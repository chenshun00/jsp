package top.huzhurong.springboot.dubbo.consumer.view;

import com.alibaba.dubbo.config.annotation.Reference;

import java.lang.annotation.*;

/**
 * 使用refer自定义注解统一调用,算得上我心里的最佳实践吧
 *
 * @author chenshun00@gmail.com
 * @since 2018/12/29
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Reference(version = "1.0.0")
public @interface Refer {
}
