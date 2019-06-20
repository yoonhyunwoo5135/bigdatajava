<%@page import="bean.BascketDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="dto" class="bean.BascketDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	<%
		ArrayList<BascketDTO> list = (ArrayList<BascketDTO>)session.getAttribute("bascket");
	%>
	장바구니에 들어간 물건의 개수: <%= list.size() %>
	<%
		for(int i = 0; i < list.size(); i++){
	%>
			제품명: <%= dto.getpId() %><br>
			개수: <%= dto.getCount() %><br>
			가격: <%= dto.getPrice() %><br>
	<%	
		}
	%>
	
</body>
</html>