package top.huzhurong.boot.feature.servlet.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 启用webconfig
 *
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@Configuration
@Slf4j
public class WebConfig {

    /**
     * ServletRegistrationBean的方式注册servlet
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new ServletBean(), "/test/servlet/**");
        String property = System.getProperty("user.home");
        if (!property.startsWith("/Users/chen")) {
            bean.setEnabled(false);
            System.err.println("ServletBean 未开启，注意修改这里来开启");
        }
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
        ServletListenerRegistrationBean<ListenerBean> bean = new ServletListenerRegistrationBean<>(new ListenerBean());
        bean.setEnabled(false);
        return bean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new FilterBean());
        bean.setEnabled(false);
        return bean;
    }


    //@Bean 的方式注册Servlet也是OK的

}
