<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언문: 전역변수 사용, 메소드 정의-->
<%!
%>
<!-- 스크립트릿(scriptlet, let: 작은 코드): 자바 코드가 들어가는 부분.(service())-> 지역변수! -->
<!-- 메소드 정의 할 수 없음. 전역변수 사용 불가! -->
<% 
/* 이 안에 자바 코드 넣으면 인식함 */
	/* HttpServletRequest requst = new HttpServletRequest(); */
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String[]hobby = request.getParameterValues("hobby");
	String result = "";
	for(int i = 0; i<hobby.length;i++){
		result = result + hobby[i] + " ";
	}
%>
<h3>당신이 입력한 정보는 아래와 같습니다.</h3>
<hr color="blue">
아이디: <%=id %><br>
비밀번호: <%=pw %><br>
이름: <%=name %><br>
전화번호: <%=tel %><br>
취미: <%=result %><br> <!-- 표현식(Expression: 변수값 출력, 연산결과, 메소드호출반환값 -->
표현식 연산결과 출력<%= 100 + 200 %>
</body>
</html>