package top.huzhurong.springboot.dubbo.consumer.view;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.huzhurong.springboot.dubbo.common.DemoService;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/27
 */
@Controller
public class ViewController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("dubbo")
    @ResponseBody
    public Object testDubbo() {
        System.out.println(demoService.hello());
        return "1";
    }

}
