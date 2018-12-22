<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Arrays" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    request.setAttribute("list", Arrays.asList("test", "inner", "jsp"));
%>
<h1>test-inner-jsp</h1>

<c:forEach var="ll" varStatus="status" items="${list}">
    <p>test ====》${ll}</p>
</c:forEach>