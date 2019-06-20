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
				$("#form").submit(function () {
					var d = $(this).serialize();//변수 값을 전부 안 써줘도 넘겨주는것
					$.ajax({
						url:"member3.jsp",
						data: d,
						success: function (result) {
							alert("ajax 통신 성공3!!");
							$("#result").text(result);
						}
					});
					return false; //action 으로 넘어가는것 방지
				});
			});
		</script>
	</head>
	<body>
		<div id = "result"></div>
		<form action="" id="form">
			id: <input type="text" name= "id">
			<button type="submit" id="button">AJAX통신</button>
		</form>
	</body>
</html>