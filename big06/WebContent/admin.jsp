<%@page import="bean.AdminDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:useBean id="dto" class="bean.AdminDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
		<%
			AdminDAO dao = new AdminDAO();
			dao.insert(dto);
		%>
	</body>
</html>