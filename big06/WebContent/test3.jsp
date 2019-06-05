<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			int result = 0;
			String japan = request.getParameter("jp");
			String china = request.getParameter("ch");
			String america = request.getParameter("am");
			int n1 =Integer.parseInt(japan);
			int n2 =Integer.parseInt(china);
			int n3 =Integer.parseInt(america);
			if(n1 > 3){
				out.println("일본을 그만 가셔야 겠군요");				
			}
			else{
				out.println("일본을 더 갈 수도 있겠군요");
			}
			if(n2 > 3){
				out.println("중국을 그만 가셔야 겠군요");				
			}
			else{
				out.println("중국을 더 갈 수도 있겠군요");			
			}
			if(n3 > 3){
				out.println("미국을 그만 가셔야 겠군요");								
			}
			else{
				out.println("미국을 더 갈 수도 있겠군요");							
			}
		%>
	</body>
</html>