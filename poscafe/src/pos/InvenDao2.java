package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import tables.InvenDto;

public class InvenDao2 {
	String url;
	String user;
	String password;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(InvenDto2 dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정 성공...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("데이터베이스 연결 성공...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "insert into inven values(?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, dto.getBean2());
		ps.setInt(2, dto.getMilk2());
		ps.setInt(3, dto.getChoco2());
		ps.setInt(4, dto.getCream2());
		ps.setInt(5, dto.getCup2());
		ps.setInt(6, dto.getStraw2());
		System.out.println("sql문 설정 성공...");
		
		ps.executeUpdate();
		System.out.println("sql문 전송 완료...");
	}
	
	public void update(InvenDto2 dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정 성공...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("데이터베이스 연결 성공...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "update inven set bean = ?, milk = ?, choco = ?, cream = ?, cup = ?, straw = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, dto.getBean2());
		ps.setInt(2, dto.getMilk2());
		ps.setInt(3, dto.getChoco2());
		ps.setInt(4, dto.getCream2());
		ps.setInt(5, dto.getCup2());
		ps.setInt(6, dto.getStraw2());
		System.out.println("sql문 설정 성공...");
		
		ps.executeUpdate();
		System.out.println("sql문 전송 완료...");
	}
	
	public void use(int bean2, int milk2, int choco2, int cream2, int cup2, int straw2) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("드라이버 설정 성공...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("데이터베이스 연결 성공...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "update inven set bean = ?, milk = ?, choco = ?, cream = ?, cup = ?, straw = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, bean2);
		ps.setInt(2, milk2);
		ps.setInt(3, choco2);
		ps.setInt(4, cream2);
		ps.setInt(5, cup2);
		ps.setInt(6, straw2);
		System.out.println("sql문 설정 성공...");
		
		ps.executeUpdate();
		System.out.println("sql문 전송 완료...");
		
		
	}
	public ArrayList selectAll(InvenDto2 dto) {
		ArrayList list = new ArrayList();
		
		try {
			//1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok...");
			//2.DB연결
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK...");
			//3.SQL문 설정(객체화)
			String sql = "select * from inven";
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 객체화 OK...");
			//4.SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK...");
			//SQL문의 결과가 있으면, 받아서 처리
			while(rs.next()) {
				dto = new InvenDto2();
				String bean = rs.getString(1);
				String milk = rs.getString(2);
				String choco = rs.getString(3);
				String cream = rs.getString(4);
				String cup = rs.getString(5);
				String straw = rs.getString(6);
				dto.setBean2(bean2);
				dto.setMilk2(milk2);
				dto.setChoco2(choco2);
				dto.setCream2(cream2);
				dto.setCup2(cup2);
				dto.setStraw2(straw2);
				list.add(dto);
			}//while close
			
		} catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}
	
	
}
