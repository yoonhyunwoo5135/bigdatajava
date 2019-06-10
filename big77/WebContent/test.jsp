<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		<%
			BbsDAO dao = new BbsDAO();
			dao.insert(dto);
		%>
		게시물 작성이 완료 되었습니다.
		<a href = test2.html>게시물 검색하기</a>
	</body>
</html>