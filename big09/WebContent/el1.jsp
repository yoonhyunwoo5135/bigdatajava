<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="el2.jsp"><!-- action은 클라이언트가 요청하는 것이여서 주소에 표현 됨 -->
			음식 <input type="text" name = "food"><br>
			<input type="submit" value="서버로 전송">
		</form>
	</body>
</html>