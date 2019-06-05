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
/* 이 안에 자바 코드 넣으면 인식함 */
	/* HttpServletRequest requst = new HttpServletRequest(); */
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String birth = request.getParameter("birth");
	String gender = request.getParameter("gender");
	String tel = request.getParameter("tel");
%>
<h3>당신이 입력한 정보는 아래와 같습니다.</h3>
<hr color="blue">
아이디: <%=id %><br>
비밀번호: <%=pw %><br>
생년월일: <%=birth %><br>
이름: <%=name %><br>
성별: <%=gender %><br>
전화번호: <%=tel %><br>
</body>
</html>