package tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InvenDao {
	String url;
	String user;
	String password;
	Connection con;
	PreparedStatement ps;
	
	public void insert(InvenDto dto) throws Exception {
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
	
	public void update(InvenDto dto) throws Exception {
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
	
	
}
