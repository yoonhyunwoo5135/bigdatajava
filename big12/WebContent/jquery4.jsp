<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
			$(function() {
				$("#button").click(function () {
					$.ajax({
						url:"member.jsp",
						success: function (result) {
							alert("ajax 통신 성공!!");
							$("#result").text(result);
						}
					});
				});
			});
		</script>
	</head>
	<body>\
		<div id = "result"></div>
		<button type="button" id = "button">버튼</button>
	</body>
</html>