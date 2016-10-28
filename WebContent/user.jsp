<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Strutrs/user/userAction2_addUser.action" method="post">
<!-- action的值  和  关联的javabean的属性 -->
<div>ID      :<input type="text" name="id"/></div>
<div>Name    :<input type="text" name="user.name"/></div>
<div>Age     :<input type="text" name="user.age"/></div>
<div>Password:<input type="text" name="user.upwd"/></div>

<!-- 集合属性的赋值 -->

<div>
<!-- 这里的value是提交到服务器的数据。而吃4、5、6、7 是显示在页面的数据 -->
<input type="checkbox" name="hobby" value="吃0"/>吃4
<input type="checkbox" name="hobby" value="吃1"/>吃5
<input type="checkbox" name="hobby" value="吃2"/>吃6
<input type="checkbox" name="hobby" value="吃3"/>吃7


</div>

<div><input type="submit" value="提交"/></div>
</form>

</body>
</html>