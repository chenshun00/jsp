package top.huzhurong.boot.feature.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/4
 */
@WebServlet(urlPatterns = "/test/*")
@Slf4j
public class TestServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("init TestServlet , " + TestServlet.class.getClassLoader());
    }

    @Override
    public void init() throws ServletException {
        log.info("TestServlet init , " + TestServlet.class.getClassLoader());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("hello testServlet");
        resp.getWriter().flush();
    }
}
