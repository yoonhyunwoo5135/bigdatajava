<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
</head>
<body>
id: <%=dto.getId() %><br>
title: <%=dto.getTitle() %><br>
content: <%=dto.getContent() %><br>
wirter: <%=dto.getWriter() %><br>
</body>
</html>