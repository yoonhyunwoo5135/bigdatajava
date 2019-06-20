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
				$("#btn").click(function name() {
					console.log("나를 눌러요");
					return false;
				});
			});
		</script>
	</head>
	<body>
		<a href="http://www.naver.com" id="btn">나를 눌러요</a>
	</body>
</html>