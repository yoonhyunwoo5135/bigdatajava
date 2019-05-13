package statistic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import inven.InvenDto;

public class StatDao {
	private String url;
	private String user;
	private String password;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private StatDto dto;
	
	public StatDto count() {
			//1.����̹� ����
			dto = new StatDto();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� ok...");
			//2.DB����
			url = "jdbc:mysql://localhost:3306/cafe";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� OK...");
			//3.SQL�� ����(��üȭ)
			String sql = "select count(*) from paybill";
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL�� ��üȭ OK...");
			//4.SQL�� ����
			rs = ps.executeQuery();
			System.out.println("4. SQL�� ���� OK...");
			//SQL���� ����� ������, �޾Ƽ� ó��
			
			while(rs.next()) {
				int count2 = rs.getInt(1);
				dto.setCount(count2);
			}
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		return dto;
	}
	public ArrayList list() {
		ArrayList list = new ArrayList();
		StatDto dto = new StatDto();
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
			String sql = "select * from paybill";
			ps = con.prepareStatement(sql);
			System.out.println("3. SQL�� ��üȭ OK...");
			//4.SQL�� ����
			rs = ps.executeQuery();
			System.out.println("4. SQL�� ���� OK...");
			//SQL���� ����� ������, �޾Ƽ� ó��
			while(rs.next()) {
				dto = new StatDto();
				int pin = rs.getInt(1);
				String menu = rs.getString(2);
				int price = rs.getInt(3);
				String cuppon = rs.getString(4);
				String jender = rs.getString(5);
				int date = rs.getInt(6);
				dto.setPin(pin);
				dto.setMenu(menu);
				dto.setPrice(price);
				dto.setCuppon(cuppon);
				dto.setJender(jender);
				dto.setDate(date);
				list.add(dto);
			}//if close
			
		} catch (Exception e) {
			System.out.println("DBó�� �� �����߻�...");
			e.printStackTrace();
		}
	return list;
}
}
