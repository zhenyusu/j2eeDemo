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
		Student stu = new Student();//(1)
		stu.setName("tom");//(2)
		out.print(stu.getName());//(3)
		request.getRequestDispatcher("/1.jsp").forward(request,response);//(4)
	%>
	<jsp:useBean id="stu1" class="com.itheima.entity.Student"></jsp:useBean><%--类似于Student stu = new Student(); --%>
	<jsp:setProperty property="name" name="stu1" value="jerry"/><%--类似于 --stu1.setName("jerry");%>
	<jsp:getProperty property="name" name="stu1"/><%--类似于out.print(stu1.getName()) --%>
	<%--http://localhost:8080/day11_02_jsp2/6.jsp?name=123  --%>
	<jsp:forward page="/1.jps">
		<jsp:param value="123" name="name"/>
	</jsp:forward><%--类似于（4）语句 --%>
</body>
</html>