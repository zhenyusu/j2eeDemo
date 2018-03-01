<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		request.setAttribute("list",list);
		
		Map map = new HashMap();
		map.put("a","aaa");
		map.put("b","bbb");
		map.put("c","ccc");
		request.setAttribute("map",map);
		
	%>

	${list}<%--[aaa,bbb,ccc] --%>
	${list[1]}<%--bbb --%>
	${map}<%--{b=bbb, c=ccc, a=aaa} --%>
	${map["b"]}<%-- bbb--%>
	${map.b }<%-- bbb--%>
</body>
</html>