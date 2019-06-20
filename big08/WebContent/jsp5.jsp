<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="jsp6.jsp" method="post"><!-- post로 요청하면 주소창에 뜨지 않음 get으로 요청하면 주소창에 뜸-->
		아이디: <input type="text" name ="id"><br>
		패스워드 <input type="text" name ="pw"><br>
		<input type="submit" value="서버로 전송">
	</form>
</body>
</html>