package top.huzhurong.boot.feature;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/1
 */
@ServletComponentScan("top.huzhurong.boot.feature")
@SpringBootApplication
@Slf4j
public class FeatureApplication {
    public static void main(String[] args) {
        //静态启动
        //SpringApplication.run(FeatureApplication.class, args);

        //自定义SpringApplication启动
        //SpringApplication application = new SpringApplication(FeatureApplication.class);
        //关闭banner
        //application.setBannerMode(Banner.Mode.OFF);
        //application.run();

        //链式api
        new SpringApplicationBuilder().sources(FeatureApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .banner((environment, sourceClass, out) -> {
                    //需关闭配置文件中的banner
                    System.out.println("====:: hhh ::====");
                })
                .run(args);
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        log.warn("application stop");
        return () -> 42;
    }

}
