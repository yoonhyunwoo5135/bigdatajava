<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		세션값 출력: ${id}<br>
		어플리케이션값 출력:${count}<br>
		<hr>
		<%
			int c = (int)application.getAttribute("count");
			int total = c + 1;
			application.setAttribute("count", total);
		%>
		<a href="set속성3.jsp">set속성3</a>
	</body>
</html>