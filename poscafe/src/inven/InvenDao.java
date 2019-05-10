package inven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InvenDao {
	String url;
	String user;
	String password;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void insert(InvenDto dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("����̹� ���� ����...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("�����ͺ��̽� ���� ����...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "insert into inven values(?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, dto.getBean());
		ps.setInt(2, dto.getMilk());
		ps.setInt(3, dto.getChoco());
		ps.setInt(4, dto.getCream());
		ps.setInt(5, dto.getCup());
		ps.setInt(6, dto.getStraw());
		System.out.println("sql�� ���� ����...");
		
		ps.executeUpdate();
		System.out.println("sql�� ���� �Ϸ�...");
	}
	
	public void update(InvenDto dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("����̹� ���� ����...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("�����ͺ��̽� ���� ����...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "update inven set bean = ?, milk = ?, choco = ?, cream = ?, cup = ?, straw = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, dto.getBean());
		ps.setInt(2, dto.getMilk());
		ps.setInt(3, dto.getChoco());
		ps.setInt(4, dto.getCream());
		ps.setInt(5, dto.getCup());
		ps.setInt(6, dto.getStraw());
		System.out.println("sql�� ���� ����...");
		
		ps.executeUpdate();
		System.out.println("sql�� ���� �Ϸ�...");
	}
	
	public void use(int bean, int milk, int choco, int cream, int cup, int straw) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("����̹� ���� ����...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("�����ͺ��̽� ���� ����...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "update inven set bean = ?, milk = ?, choco = ?, cream = ?, cup = ?, straw = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, bean);
		ps.setInt(2, milk);
		ps.setInt(3, choco);
		ps.setInt(4, cream);
		ps.setInt(5, cup);
		ps.setInt(6, straw);
		System.out.println("sql�� ���� ����...");
		
		ps.executeUpdate();
		System.out.println("sql�� ���� �Ϸ�...");
		
		
	}
	public InvenDto list() {
		
		InvenDto dto = new InvenDto();
		try {
			//1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ok...");
			//2.DB����
			url = "jdbc:mysql://localhost:3306/cafe";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� OK...");
			//3.SQL�� ����(��üȭ)
			String sql = "select * from inven";
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL�� ��üȭ OK...");
			//4.SQL�� ����
			rs = ps.executeQuery();
			System.out.println("4. SQL�� ���� OK...");
			//SQL���� ����� ������, �޾Ƽ� ó��
			while(rs.next()) {
				dto = new InvenDto();
				int bean = rs.getInt(1);
				int milk = rs.getInt(2);
				int choco = rs.getInt(3);
				int cream = rs.getInt(4);
				int cup = rs.getInt(5);
				int straw = rs.getInt(6);
				dto.setBean(bean);
				dto.setMilk(milk);
				dto.setChoco(choco);
				dto.setCream(cream);
				dto.setCup(cup);
				dto.setStraw(straw);
			}//while close
			
		} catch (Exception e) {
			System.out.println("DBó�� �� �����߻�...");
			e.printStackTrace();
		}
		
		return dto;
	}

	
}
