package top.huzhurong.boot.feature.importing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/5
 */
@Configuration
@Import({TestBean.class})
@ImportResource("/xml/xml.xml")
@Slf4j
public class TestConfiguration {

}
