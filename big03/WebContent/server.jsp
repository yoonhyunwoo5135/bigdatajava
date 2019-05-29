<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //html에서 자바 코드를 사용 하는 법
	String id= request.getParameter("id");
	String pw= request.getParameter("pw");
	String name= request.getParameter("name");
	String tel= request.getParameter("tel");
	String[] hobby= request.getParameterValues("hobby");
	out.print("취미 리스트 입니다."+ "<hr>");
	for(int i = 0; i < hobby.length; i++){
		out.print(hobby[i] + "<br>");
	}
%>
<hr>
받아온 파라메터 값 <br>
ID: <%= id %> <br>
PW: <%= pw %> <br>
NAME: <%= name %> <br>
TEL: <%= tel %> <br>
음식: ${param.food}<br>
성별: ${param.gender}<br>



</body>
</html>