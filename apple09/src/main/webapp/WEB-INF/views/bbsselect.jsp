<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script type="text/javascript">
		 $(function(){   
	         $("#insert").submit(function(){
	            var d = $(this).serialize();
	            $.ajax({
	               url:"bbsselect.jsp",
	               data: d,
	               success: function(result){
	                  alert("ajax 통신성공");
	                  $("#result").text(result);
	               }
	            });
	            return false;
	         });
	      });   
		</script>
		
	</head>
	<body>
		<h1>검색된 정보</h1>
		아이디 : ${dto.id }<br>
		제목 : ${dto.pw }<br>
		내용 : ${dto.name }<br>
		글쓴이 : ${dto.tel }<br>
		<form action="replyinsert.do">
			작성자: <input type="text" name="name">
			내용: <input type="text" name="content">
		<input type="submit" value="입력" id = "insert">
		</form>
		<c:forEach var="dto" items="${list}">
			작성자: ${dto.name}<br>
			내용: ${dto.content}
			<hr color="blue">
		</c:forEach>
		
	</body>
</html>