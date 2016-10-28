<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%//引入  struts标签 %>   
 <%//这里的struts标签需要经过  dispatcher过滤器才能使用、web.xml  需要配置成   { /* } %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Strutrs/user3/action1_executek.action" method="post">

<s:token></s:token>

<div>UserName:<input type="text" name="user.name"/></div>
<div>Address:<input type="text" name="user.address/"></div>
<div>Age:<input type="text" name="user.age"/></div>
<div><input type="submit"  value="提交"/></div>



</form>
</body>
</html>