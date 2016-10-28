<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UP Title</title>
</head>
<body>
<form action="/Strutrs/user1/action1_upLoad.action" method="post" 
		enctype="multipart/form-data">
<%//多文件上传 设置相同的   name %>
<div>文件:<input type="file" name="img"/>   </div>
<div>文件:<input type="file" name="img"/>   </div>
<div>文件:<input type="file" name="img"/>   </div>
<div> <input type="submit" value="提交"></div>

</form>
</body>
</html>