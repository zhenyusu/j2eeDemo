<%@page import="com.itheima.entity.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		Student stu = (Student)request.getAttribute("s");
		out.print(stu.getName());
	%>
	
	${s}<!-- ${s}==findAttribute("s")-->
	${s.name} 
	${s.city.address}<!-- 属性导航 -->
	${s.city["address"]}
</body>
</html>