<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Map Jsp</title>
</head>
<body>
<%=request.getAttribute("map1") %>
<%out.println(session.getAttribute("map2")); %>
<%out.println(application.getAttribute("map3")); %>
</body>
</html>