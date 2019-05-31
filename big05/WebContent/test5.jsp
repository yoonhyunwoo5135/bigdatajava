<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
			var num = 0;
			function sum() {
				if(document.getElementById("sum")){
				num++;
				alert(num);
				}
			}
			function dim() {
				if(document.getElementById("dim")){
				num--;
				alert(num);
				}
		
			}
			function reset() {
				if(document.getElementById("reset")){
				num = 0;
				alert(num);
				}
			}
		</script>
	</head>
	<body>
		<button type="button" id ="sum" onclick="sum()">+1</button>
		<button type="button" id = "dim" onclick="dim()">-1</button>
		<button type="button" id = "reset" onclick="reset()">초기화</button>
	</body>
</html>