package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AddDao {
	String url;
	String user;
	String password;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public AddDto Addbean() {
		AddDto dto = new AddDto();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		System.out.println("����̹� ���� ����...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("�����ͺ��̽� ���� ����...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "update inven set bean = bean + ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, Integer.parseInt(Inven.t1.getText()));
		System.out.println("sql�� ���� ����...");
		
		ps.executeUpdate();
		System.out.println("sql�� ���� �Ϸ�...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
		
	}
	public void Addmilk() {
		
	}
	public void Addchoco() {
		
	}
	public void Addcream() {
		
	}
	public void Addcup() {
		
	}
	public void Addstraw() {
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		AddDao add = new AddDao();
	}

}
