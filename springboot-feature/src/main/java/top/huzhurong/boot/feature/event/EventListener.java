package top.huzhurong.boot.feature.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.logging.LoggingApplicationListener;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/1
 */
@Order(LoggingApplicationListener.DEFAULT_ORDER + 2)
public class EventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    /**
     * Gets Logger After LoggingSystem configuration ready
     *
     * @see LoggingApplicationListener
     */
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        final Logger logger = LoggerFactory.getLogger(getClass());

        String bannerText = buildBannerText();

        if (logger.isInfoEnabled()) {
            logger.info(bannerText);
        } else {
            System.out.print(bannerText);
        }
    }

    private String buildBannerText() {
        String LINE_SEPARATOR = System.getProperty("line.separator");
        return LINE_SEPARATOR + " :: Spring Boot (Feature) :: " + LINE_SEPARATOR;
    }
}
