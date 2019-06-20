<%@page import="bean.BascketDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			Cookie[] cookies = request.getCookies();
			for(int i = 0; i < cookies.length; i++){
						out.write("제품명:" + cookies[i].getValue() + "<br>");
			}
		%>
		
	</body>
</html>