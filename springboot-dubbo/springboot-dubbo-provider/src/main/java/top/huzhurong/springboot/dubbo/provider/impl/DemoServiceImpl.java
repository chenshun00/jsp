package top.huzhurong.springboot.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import top.huzhurong.springboot.dubbo.common.DemoService;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/27
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@org.springframework.stereotype.Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello() {
        return "hello dubbo!";
    }
}
