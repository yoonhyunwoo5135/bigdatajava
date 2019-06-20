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
			Cookie cookie = new Cookie("key", "value");
			Cookie cookie1 = new Cookie("hi", "hello");
			Cookie cookie2 = new Cookie("name", "hong");
			Cookie cookie3 = new Cookie("subject", "jsp");
			Cookie cookie4 = new Cookie("JSESSIONID", "DD");
			cookie4.setMaxAge(0);
			response.addCookie(cookie);
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			response.addCookie(cookie3);
			response.addCookie(cookie4);
		%>
		<jsp:forward page="cookie2.jsp"></jsp:forward>
	</body>
</html>