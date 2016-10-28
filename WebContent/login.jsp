<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%//这里是 动态方法的调用、指定某一个方法。 %>
<!-- <form action="/Strutrs/user1/userAction.action" method="post"> -->
<%//这里是通配符的使用 %>
<form action="/Strutrs/user1/userAction_Login.action" method="post">
<div>username:<input type="text" name="username"></div>
<div>password:<input type="text" name="password"></div>
<div><input type="submit" value="提交"></div>
<!-- 这里测试的是 dispatcher  struts中的。 -->
<%= request.getParameter("username")%>
<% out.println(request.getParameter("password")); %>
</form>
</body>
</html>