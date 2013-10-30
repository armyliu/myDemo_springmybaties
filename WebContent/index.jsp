<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%
	String basePath = request.getContextPath();
	request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>index</title>
</head>

<body>
	<a href="hello.html">Enter...</a>
	<br>
	
	<form action="login.html" method="post">
		<input type="text" name="username" value=""/>
		<input type="text" name="password" value=""/>
		<input type="submit" name="submit" value="登录" />
	</form>
	
	<form action="register.html" method="post">
		<input type="text" name="username" value=""/>
		<input type="text" name="password" value=""/>
		<input type="submit" name="submit" value="注册" />
	</form>
	
</body>
</html>