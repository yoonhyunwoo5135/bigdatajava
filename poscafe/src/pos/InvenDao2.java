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
		System.out.println("����̹� ���� ����...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("�����ͺ��̽� ���� ����...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "insert into inven values(?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, dto.getBean2());
		ps.setInt(2, dto.getMilk2());
		ps.setInt(3, dto.getChoco2());
		ps.setInt(4, dto.getCream2());
		ps.setInt(5, dto.getCup2());
		ps.setInt(6, dto.getStraw2());
		System.out.println("sql�� ���� ����...");
		
		ps.executeUpdate();
		System.out.println("sql�� ���� �Ϸ�...");
	}
	
	public void update(InvenDto2 dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("����̹� ���� ����...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("�����ͺ��̽� ���� ����...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "update inven set bean = ?, milk = ?, choco = ?, cream = ?, cup = ?, straw = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, dto.getBean2());
		ps.setInt(2, dto.getMilk2());
		ps.setInt(3, dto.getChoco2());
		ps.setInt(4, dto.getCream2());
		ps.setInt(5, dto.getCup2());
		ps.setInt(6, dto.getStraw2());
		System.out.println("sql�� ���� ����...");
		
		ps.executeUpdate();
		System.out.println("sql�� ���� �Ϸ�...");
	}
	
	public void use(int bean2, int milk2, int choco2, int cream2, int cup2, int straw2) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("����̹� ���� ����...");
		url = "jdbc:mysql://localhost:3306/cafe";
		user = "root";
		password = "1234";
		System.out.println("�����ͺ��̽� ���� ����...");
		
		con = DriverManager.getConnection(url, user, password);
		String sql = "update inven set bean = ?, milk = ?, choco = ?, cream = ?, cup = ?, straw = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, bean2);
		ps.setInt(2, milk2);
		ps.setInt(3, choco2);
		ps.setInt(4, cream2);
		ps.setInt(5, cup2);
		ps.setInt(6, straw2);
		System.out.println("sql�� ���� ����...");
		
		ps.executeUpdate();
		System.out.println("sql�� ���� �Ϸ�...");
		
		
	}
	public ArrayList selectAll(InvenDto2 dto) {
		ArrayList list = new ArrayList();
		
		try {
			//1.����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ok...");
			//2.DB����
			url = "jdbc:mysql://localhost:3306/bigdata";
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
			System.out.println("DBó�� �� �����߻�...");
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}
	
	
}
