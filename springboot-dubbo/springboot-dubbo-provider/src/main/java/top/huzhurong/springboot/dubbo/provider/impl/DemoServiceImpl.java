package top.huzhurong.springboot.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import top.huzhurong.springboot.dubbo.common.DemoService;

/**
 * 已经被注入了,不需要使用Spring的 {@link org.springframework.stereotype.Service} 进行注解了
 *
 * @author chenshun00@gmail.com
 * @since 2018/12/27
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello() {
        return "hello dubbo!";
    }
}
