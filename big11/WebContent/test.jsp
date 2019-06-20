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
					$("div").append($("input").val() + "<br>");
				})
			});
		</script>
	</head>
	<body>
		내용을 입력하세요.<br>
		<input type="text">
		<button type="button">클맄!</button>
		<ul>
			<li>----------댓글---------</li>
		</ul>
		<div></div>
	</body>
</html>