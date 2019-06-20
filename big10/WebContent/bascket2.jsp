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
				String pId = request.getParameter("pId"); 
		
		
				Cookie cookie = new Cookie(pId , pId);
				response.addCookie(cookie);
		%>
		<a href="bascketview2.jsp">장바구니 보러가기</a>
	</body>
</html>