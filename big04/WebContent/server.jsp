<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href= "Test.css">
	</head>
	<body>
		<div id = "total">
			<div id = "top">
			</div>
			<center>
			<div id = "top2">
				<ul>
					<li class = "t1"><a href = "css1.html" >회사 소개</a></li>
					<li class = "t1"><a href = "css2.html" >회사 제품</a></li>
					<li class = "t1"><a href = "css3.html" >게시판</a></li>
					<li class = "t1"><a href = "css4.html" >회사 연락처</a></li>
				</ul>
			</div>
			<div id = "content" border ="1" bordercolor = "blue">
			<table>
				<tr>
					<td class="t1">아이디 결과</td>
					<td class="t2">${param.id}</td>
				</tr>
				<tr>
					<td class="t1">패스워드 결과</td>
					<td class="t2">${param.pw}</td>
				</tr>
				<tr>
					<td class="t1">이름 결과</td>
					<td class="t2">${param.name}</td>
				</tr>
				<tr>
					<td class="t1">전화번호 결과</td>
					<td class="t2">${param.tel}</td>
				</tr>
			</table>
			</div>
			</center>
		</div>
	</body>
</html>