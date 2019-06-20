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
				$("button").click(function() {
					$("body").append("<img src = music.png>");
				});
			});
		</script>
	</head>
	<body>
		내용을 입력하세요.<br>
		<img src = "music.png"><br>
		<button type="button">클맄!</button>
	</body>
</html>