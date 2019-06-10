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
			dao.update(dto);
		%>
		게시물 수정이 완료 되었습니다.
		검색해보시겠습니까?<a href = test3.jsp?id=<%=dto.getId() %>>수정된 내용 확인 해보기</a>
	</body>
</html>