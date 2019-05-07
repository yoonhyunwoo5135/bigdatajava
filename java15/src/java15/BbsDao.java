package java15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BbsDao {
	String url;
	String user;
	String password;
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	BbsDto dto = null;
	//CURD
	//������ �޼ҵ�� ������ �Ѵ�.
	//SQL�� select * from bbs where id = ?
	public BbsDto select(String inputId) {
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
			String sql = "select * from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1 , inputId);
			System.out.println("3. SQL�� ��üȭ OK...");
			//4.SQL�� ����
			rs = ps.executeQuery();
			System.out.println("4. SQL�� ���� OK...");
			//SQL���� ����� ������, �޾Ƽ� ó��
			if(rs.next()) {
				dto = new BbsDto();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
			}
			else {
				System.out.println("�˻� ����� �����ϴ�.");
			}
			
			
		} catch (Exception e) {
			System.out.println("DBó�� �� �����߻�...");
			System.out.println(e.getMessage());
		}
		finally {
			//���� �߻����ο� ��� ���� ������ ������Ѿ� �ϴ� �ڵ�
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace(); �ᵵ �Ƚᵵ ��� ����.
				System.out.println("�ڿ� ���� �� ���� �߻�");
			}//catch end
		}//try - catch - finally end
		return dto;
	}//select end
	public BbsDto delete(String inputId) {
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
			String sql = "delete from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1 , inputId);
			System.out.println("3. SQL�� ��üȭ OK...");
			//4.SQL�� ����
			ps.executeUpdate();
			System.out.println("4. SQL�� ���� OK...");
			//SQL���� ����� ������, �޾Ƽ� ó��
			
		}
		catch (Exception e) {
			System.out.println("DBó�� �� �����߻�...");
			System.out.println(e.getMessage());
		}
		finally {
			//���� �߻����ο� ��� ���� ������ ������Ѿ� �ϴ� �ڵ�
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace(); �ᵵ �Ƚᵵ ��� ����.
				System.out.println("�ڿ� ���� �� ���� �߻�");
			}//catch end
		}//try - catch - finally end
		return dto;
	}//delete end
	public BbsDto insert(BbsDto dto) {
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
			String sql = "insert into bbs values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1 , dto.getId());
			ps.setString(2 , dto.getTitle());
			ps.setString(3 , dto.getContent());
			ps.setString(4 , dto.getEtc());
			System.out.println("3. SQL�� ��üȭ OK...");
			//4.SQL�� ����
			ps.executeUpdate();
			System.out.println("4. SQL�� ���� OK...");
			//SQL���� ����� ������, �޾Ƽ� ó��
		}
		catch (Exception e) {
			System.out.println("DBó�� �� �����߻�...");
			System.out.println(e.getMessage());
		}
		finally {
			//���� �߻����ο� ��� ���� ������ ������Ѿ� �ϴ� �ڵ�
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace(); �ᵵ �Ƚᵵ ��� ����.
				System.out.println("�ڿ� ���� �� ���� �߻�");
			}//catch end
		}//try - catch - finally end
		return dto;
	}//insert end
	public BbsDto update(BbsDto dto) {
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
			String sql = "update bbs set id = ?, title = ?, content = ?, etc = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1 , dto.getId());
			ps.setString(2 , dto.getTitle());
			ps.setString(3 , dto.getContent());
			ps.setString(4 , dto.getEtc());
			System.out.println("3. SQL�� ��üȭ OK...");
			//4.SQL�� ����
			ps.executeUpdate();
			System.out.println("4. SQL�� ���� OK...");
			//SQL���� ����� ������, �޾Ƽ� ó��
		}
		catch (Exception e) {
			System.out.println("DBó�� �� �����߻�...");
			System.out.println(e.getMessage());
		}
		finally {
			//���� �߻����ο� ��� ���� ������ ������Ѿ� �ϴ� �ڵ�
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace(); �ᵵ �Ƚᵵ ��� ����.
				System.out.println("�ڿ� ���� �� ���� �߻�");
			}//catch end
		}//try - catch - finally end
		return dto;
	}//update end
	

}//class end
