package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminDAO {
	
	
	public void insert(AdminDTO dto) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("드라이버 설정 ok..");
			String url = "jdbc:mysql://localhost:3306/bigdata";
			String user ="root";
			String password = "1234";
			System.out.println("드라이버 설정 ok...");
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공...");
			
			String sql = "insert into admin values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			ps.setString(5, dto.getGender());
			System.out.println("sql문 객체화ok...");
			
			ps.executeUpdate();
			System.out.println("sql문 전송 ok...");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
