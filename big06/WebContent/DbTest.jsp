<%@page import="java.sql.PreparedStatement"%>
<%@page import="bean.MemberDTO"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
			try{
				String id = request.getParameter("id");
				String pw = request.getParameter("pw");
				String name = request.getParameter("name");
				String tel = request.getParameter("tel");
				
				Class.forName("com.mysql.jdbc.Driver");
				out.write("드라이버 설정 ok..");
				String url = "jdbc:mysql://localhost:3306/bigdata";
				String user ="root";
				String password = "1234";
				out.write("드라이버 설정 ok...");
				
				Connection con = DriverManager.getConnection(url, user, password);
				out.write("DB연결 성공...");
				
				String sql = "insert into member values(?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);
				ps.setString(2, pw);
				ps.setString(3, name);
				ps.setString(4, tel);
				out.write("sql문 객체화ok...");
				
				ps.executeUpdate();
				out.write("sql문 전송 ok...");
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		%>
		
	</body>
</html>