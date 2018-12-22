<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%
    WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(application);
    request.setAttribute("chen",webApplicationContext);
%>
<h1>hello</h1>
<h2>11 ${chen}</h2>