<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
		<jsp:setProperty property="*" name="dto"/>
		
		<%
			//자동 import 컨트롤 + 쉬프트 + M
			BbsDAO dao = new BbsDAO();
			BbsDTO dto2 = dao.select(dto);
		%>
		<center>
			<h1>검색 결과 입니다.</h1>
			<hr>
			<form action="test2.jsp">
				ID: <input type="text" name="id" size = 10 value = <%= dto2.getId() %> readonly="readonly">
				Title: <input type="text" name="title" size = 40 value = <%= dto2.getTitle() %>><br>
				Content:<br>
				<input type="text" name="content" size = 100 value = <%= dto2.getContent() %>><br>
				Etc:<br>
				<input type="text" name="etc" value = <%= dto2.getEtc() %>><br>
				<button type="submit" class="btn btn-info">수정하기</button>
			</form>
		</center>
	</body>
</html>