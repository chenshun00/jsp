<%--
  Created by IntelliJ IDEA.
  User: chenshun00@gmail.com
  Date: 2018/12/30
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="/css/my.css">
    <script src="/js/jquery-2.1.1.min.js"></script>
    <script src="/js/my.js"></script>
</head>
<body>
<div id="content"></div>
<input type="text" placeholder="请输入要发送的信息" id="msg" class="msg">
<input type="button" value="发送" class="send" onclick="sendMsg()">
<input type="button" value="清空" class="clear" onclick="clearAll()">
</body>
</html>