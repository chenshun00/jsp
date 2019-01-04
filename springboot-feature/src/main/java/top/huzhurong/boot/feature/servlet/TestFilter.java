package top.huzhurong.boot.feature.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@Slf4j
@WebFilter
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("TestFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("filter :{}", ((HttpServletRequest) request).getRequestURL());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
