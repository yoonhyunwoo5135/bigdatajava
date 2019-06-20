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
				
				//$("li").empty();//empty는 자식을 지움
				//$("li").remove();// remove는 자기 자신을 지움
				//$("li").addClass("aqua");
				$("#b1").click(function() {
					$("li").addClass("aqua");
				});
				$("#b2").click(function() {
					$("li").removeClass("aqua");
				});
			});
		</script>
		<style type="text/css">
			.aqua{
				background: aqua;
			}
		</style>
	</head>
	<body>
		<button type="button" id = "b1">나를 눌러요.</button>
		<button type="button" id = "b2">나도 눌러요.</button>
		<ul>
			<li>감자</li>
			<li>고구마</li>
			<li>양파</li>
		</ul>
	</body>
</html>