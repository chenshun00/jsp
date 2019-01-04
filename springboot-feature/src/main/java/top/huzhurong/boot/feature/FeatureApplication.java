package top.huzhurong.boot.feature;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/1
 */
@SpringBootApplication
@Slf4j
public class FeatureApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeatureApplication.class, args);
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        log.warn("application stop");
        return () -> 42;
    }

}
