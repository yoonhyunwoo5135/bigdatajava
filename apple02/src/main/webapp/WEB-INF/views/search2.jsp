<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table style ="border: 1px solid black;">
			<tr style ="border: 1px solid black;">
				<td style ="border: 1px solid black;">상품 아이디</td>
				<td style ="border: 1px solid black;">상품 이름</td>
				<td style ="border: 1px solid black;">상품 가격</td>
				<td style ="border: 1px solid black;">마일리지</td>
			</tr>
			<tr style ="border: 1px solid black;">
				<td style ="border: 1px solid black;">${productDTO.id}</td>
				<td style ="border: 1px solid black;">${productDTO.name}</td>
				<td style ="border: 1px solid black;">${productDTO.price}</td>
				<td style ="border: 1px solid black;">${productDTO.mileage}</td>
			</tr>
		</table>
	</body>
</html>