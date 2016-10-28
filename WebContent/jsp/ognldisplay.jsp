<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:debug></s:debug>
<%//直接获取 action中的数据 %>
<s:property value="name"/>
<s:property value="age"/>
<s:property value="address"/>
<%//获得 非valuestack对象的的其他对象引用%>
<%//请求参数 的获取  %>
<s:property value="#parameters.jj"/>
<%// 非值栈对象的数据的获取。 request范围的属性的获取 %>
<s:property value="#request.good"/>
<%// session 范围的属性的获取 %>
<s:property value="#session.chengxiang"/>
<%//方法的调用 %>
<s:property value="user.getName()"/>
<s:property value="user.name"/>
</body>
</html>