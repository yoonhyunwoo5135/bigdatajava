<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>상품 등록 성공</h1>
		<h3>상품 아이디: ${productDTO.id}</h3>
		<h3>상품 이름: ${productDTO.name}</h3>
		<h3>상품 가격: ${productDTO.price}</h3>
		<h3>마일리지: ${productDTO.mileage}</h3>
	</body>
</html>