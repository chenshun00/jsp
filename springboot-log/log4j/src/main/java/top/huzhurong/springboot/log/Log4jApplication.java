package top.huzhurong.springboot.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenshun00@gmail.com
 * @since 2018/12/27
 */
@SpringBootApplication
public class Log4jApplication {

    static {
        //指定日志目录或者使用 -Dwebapp.root=/Users/chenshun/open/jsp/springboot-log/log4j
        if (!System.getProperty("user.home").startsWith("/Users/chenshun")) {
            System.out.println("修改webapp.root的目录,以便顺利启动");
            System.exit(1);
        }
        System.setProperty("webapp.root", "/Users/chenshun/open/jsp/springboot-log/log4j");
    }

    public static void main(String[] args) {
        SpringApplication.run(Log4jApplication.class, args);
    }
}
