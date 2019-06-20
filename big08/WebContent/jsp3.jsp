<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청 방식:<%= request.getScheme() %><br>
	<%= request.getServerName() %><br>
	<%= request.getLocalAddr() %><br>
	<%= request.getServerPort() %><br>
	<%= request.getRemotePort() %><br>
	<%= request.getRemoteHost() %><br>
	<%= request.getRemoteAddr() %><br>
	<hr>
	<%= request.getRequestURI() %><br><!-- 요청한 사이트 보여줌 -->
	<%= request.getRequestURL() %><br><!-- 요청한 주소를 보여줌 -->
	<%= request.getContextPath() %><br>
	<!-- context = project = 웹 어플리케이션 이 세가지는 모두 같은 말이다. -->
</body>
</html>