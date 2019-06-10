<%@page import="bean.MemberDTO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	<%
		//자동 import 컨트롤 + 쉬프트 + M
		MemberDAO dao = new MemberDAO();
		MemberDTO dto2 = dao.select(dto);
	%>
	검색 결과 입니다.
	<hr>
	<form action="member2.jsp">
		<input type="text" name="id" value = <%= dto2.getId() %> readonly="readonly"><br>
		<input type="text" name="pw" value = <%= dto2.getPw() %>><br>
		<input type="text" name="name" value = <%= dto2.getName() %>><br>
		<input type="text" name="tel" value = <%= dto2.getTel() %>><br>
		<input type="submit" value="서버로 전송">
	</form>
</body>
</html>