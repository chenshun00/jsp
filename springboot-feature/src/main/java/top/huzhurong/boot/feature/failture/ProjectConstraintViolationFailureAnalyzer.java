package top.huzhurong.boot.feature.failture;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.diagnostics.FailureAnalysis;
import org.springframework.boot.diagnostics.FailureAnalyzer;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/1
 */
@Slf4j
public class ProjectConstraintViolationFailureAnalyzer implements FailureAnalyzer {
    @Override
    public FailureAnalysis analyze(Throwable failure) {
        log.error("springBoot 启动异常:" + failure.getMessage(), failure);
        return new FailureAnalysis(failure.getMessage(), "springBoot 启动异常", failure);
    }
}
