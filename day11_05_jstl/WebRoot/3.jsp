<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 普通循环 -->
	<%--for(i = 1; i <=10; i++) --%>
	<c:forEach var="i" begin="1" end="10" step="1">
		${i}<br/>
	</c:forEach>
	
	<%
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		request.setAttribute("list",list);
	%>

	<!-- 迭代器 -->
	<%--
		for(List l:list){}
	 --%>
	<c:forEach items="${list}" var ="l">
		${l }
	</c:forEach>
</body>
</html>