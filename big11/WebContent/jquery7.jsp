<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
/* 			$(document).ready(function() {
				
			}); */
			$(function() {
				$(":text").css("border", "2px solid yellow");
				$(":checked").attr("checked" , false);
				$(":selected").attr("selected" , false);
				
				
			});
		</script>
	</head>
	<body>
		이름 <input type="text" value="홍길동"><br>
		소속 <input type="text" value="itbank"><br>
		아침을 먹었나요? <input type="checkbox">네
		<input type="checkbox">아니요<br>
		먹은음식종류
		<select id = "food">
			<option value="자장면" >자장면</option>
			<option value="짬뽕" selected="selected">짬뽕</option>
		</select>
	</body>
</html>