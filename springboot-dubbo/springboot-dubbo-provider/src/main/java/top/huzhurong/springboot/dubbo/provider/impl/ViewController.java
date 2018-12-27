package top.huzhurong.springboot.dubbo.provider.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.huzhurong.springboot.dubbo.common.DemoService;

import javax.annotation.Resource;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/27
 */
@Controller
public class ViewController implements InitializingBean {

    @Resource
    private DemoService demoService;

    @RequestMapping("tt")
    @ResponseBody
    public Object test() {
        return "!";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(11);
    }
}
