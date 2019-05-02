package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DbTest2 {
	
		Connection con;
		String url;
		String user;
		String password;
		PreparedStatement ps;
	
	
	public void insert(String id, String pw, String name, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1.드라이버 설정 OK....");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK....");

		String sql = "insert into member values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.SQL문 결정 OK....");
		
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		
	}
	public void update(String id, String pw, String name, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1.드라이버 설정 OK....");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK....");

		String sql = "update member set tel = ? where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3.SQL문 결정 OK....");
		
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		
		
		
	}
	public void delete(String id, String pw, String name, String tel) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("1.드라이버 설정 OK....");
		
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 OK....");

		String sql = "delete from member where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3.SQL문 결정 OK....");
		
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 OK....");
		
		
		
	}

}
