package top.huzhurong.boot.thymeleaf.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@Controller
public class ViewController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ModelAndView messages() {
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("hello", "hello templates!");
        return mav;
    }

}
