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
				var check = false;
				$("#food").change(function() {
					if(check == true){
						$("#top input").attr("checked", false);
						check = false;
					}
					else{
						$("#top input").attr("checked", true);						
						check = true;
					}
				});
			});
		</script>
	</head>
	<body>
	<ul id = "top"><input type="checkbox" id = "food">음식
		<li><input type="checkbox">고구마</li>
		<li><input type="checkbox">감자</li>
		<li><input type="checkbox">맛초킹</li>
	</ul>
	</body>
</html>