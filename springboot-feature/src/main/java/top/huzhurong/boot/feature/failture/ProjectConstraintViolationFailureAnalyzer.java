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
        //发送钉钉消息
        return new FailureAnalysis(failure.getMessage(), failure.getMessage(), failure);
    }
}
