package top.huzhurong.boot.feature.servlet.bean;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@Slf4j
public class FilterBean implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("FilterBean init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("FilterBean doFilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
