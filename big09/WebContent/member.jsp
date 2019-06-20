<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean><!-- import와 new 생성자 역할 -->
		<jsp:setProperty property="*" name="dto"/><!-- 파라메터 받아서 set메소드를 다 불러주는 역할-->
		
		<jsp:getProperty property="id" name="dto"/>
		<br>
		${dto.id}
		<br>
		<%= dto.getId() %>
	</body>
</html>