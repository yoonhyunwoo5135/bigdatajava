<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="update">
			수정할 아이디: <input type="text" name = "selectId"><br>
			ID: <input type="text" name = "id"><br>
			TITLE: <input type="text" name = "title"><br>
			CONTENT: <input type="text" name = "content"><br>
			WRITER: <input type="text" name = "writer"><br>			
			<input type="submit" value = "업데이트">		
		</form>
	</body>
</html>