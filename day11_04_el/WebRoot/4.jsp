<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str1 = null;
		request.setAttribute("str",str1);
		
		String str2 = "";
		request.setAttribute("str2",str2);
		
		String str3 = "abc";
		request.setAttribute("str3",str3);
		
		List list1 = new ArrayList();
		request.setAttribute("list1",list1);
		
		List list2 = new ArrayList();
		list2.add("asfd");
		request.setAttribute("list2",list2);
		
		int sex = 1;
		request.setAttribute("s",sex);
	%>

	${empty str1 }----true</br>
	${empty str2 }----true</br>
	${empty str3 }----false</br>
	${empty list1}----true</br>
	${empty list2}----false</br>
	
	<%--三元运算符 --%>
	${empty list1 ? "list为空":"list不是空"}</br>
	
	<input type = "radio" name = "sex" value = "m" ${s==0 ? "checked='checked'":"" }/>男<br/>
	<input type = "radio" name = "sex" value = "f" ${s==1 ? "checked='checked'":"" }/>女<br/>
	
</body>
</html>