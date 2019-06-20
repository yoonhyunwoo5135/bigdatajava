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
				$("#b1").mouseover(function() {
					alert("내 위에 마우스가 있군요.");
				});
				$("#b2").mouseout(function() {
					alert("나를 정말로 떠나시려구요?");					
				});
				$("#data").keyup(function() {
					var id = "root";
					var data = $("#data").val();
					if(data.equals(id)){
						$("#result").text("5글자 미만입니다.");
					}
					else if(!data.equals(id)){
						$("#result").text($("#data").val());												
					}
				});
			});
		</script>
	</head>
	<body>
		<button type="button" id = "b1">내 위로 올려요.</button>
		<button type="button" id = "b2">나를 떠나요.</button>
		<br>
		<input type="text" id= "data">
		<div id = "result"></div>
	</body>
</html>