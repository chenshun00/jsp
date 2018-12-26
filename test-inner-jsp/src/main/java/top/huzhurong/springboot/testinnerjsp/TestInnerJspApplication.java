package top.huzhurong.springboot.testinnerjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestInnerJspApplication {
    static {
        System.setProperty("user.home","/data/project/chenshun");
    }
    public static void main(String[] args) {
        SpringApplication.run(TestInnerJspApplication.class, args);
    }

}

