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

<title>welcome</title>
</head>

<body>
	<h4>welcome,<label>${message}</label></h4>
	
</body>
</html>