package top.huzhurong.springboot.dubbo.provider.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/27
 */
@Controller
public class ViewController {
    @RequestMapping("tt")
    @ResponseBody
    public Object test() {
        return "!";
    }
}
