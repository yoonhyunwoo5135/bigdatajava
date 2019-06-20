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
		//장바구니 세션이 이미 있는지 없는지 체크
		ArrayList<BascketDTO> list = (ArrayList<BascketDTO>)session.getAttribute("bascket");
		if(list==null){
			//장바구니로 사용할 arraylist 생성
			list = new ArrayList<>();
			list.add(dto);
			session.setAttribute("bascket", list);
		}
		else{
			list.add(dto);
			session.setAttribute("bascket", list);
		}
		
	%>
	<a href="bascketview.jsp">장바구니 보러가기</a>
</body>
</html>