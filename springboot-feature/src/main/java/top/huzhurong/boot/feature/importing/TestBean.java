package top.huzhurong.boot.feature.importing;

import org.springframework.context.annotation.Bean;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/5
 */
public class TestBean {

    /**
     * jmap -histo:live ${pid} | grep top.huzhurong.boot.feature.importing
     */
    @Bean
    public User uus() {
        return new User("chenshun00");
    }

}
