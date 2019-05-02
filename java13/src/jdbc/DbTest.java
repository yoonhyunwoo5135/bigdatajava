package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DbTest {
	public static void main(String[] args) throws Exception {
//		1.����̹� ����
		Class.forName("com.mysql.jdbc.Driver");//�����ͺ��̽� => ����̹������� => ����ϴ� DB���� => class name ����
		System.out.println("1.����̹� ���� OK....");
//		2.DB����(DB��, id, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";//��Ű����:DBSW://localhost:port/�������̸� => mySQL���� Driver properties���� Ȯ�� ����
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);//����, ����
		System.out.println("2.DB���� OK....");
//		3.SQL�� ����
		String id = JOptionPane.showInputDialog("ID�Է�");
		String pw = JOptionPane.showInputDialog("pw�Է�");
		String name = JOptionPane.showInputDialog("name�Է�");
		String tel = JOptionPane.showInputDialog("tel�Է�");
		
//		String sql = "insert into member values('"+ id +"','"+ pw +"','"+ name +"', '"+ tel +"')";//SQL�� ����Ͽ� ������ ����
		String sql = "insert into member values(?,?,?,?)";//SQL�� ����Ͽ� ������ ����, '?' ��� ����
		PreparedStatement ps = con.prepareStatement(sql);//SQL������ ���� �ϴ� ��
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.SQL�� ���� OK....");
//		��üȭ
//		String url1 = "http://www.naver.com";
//		URL url2 = new URL(url1);
		
		
//		4.SQL����
		ps.executeUpdate();//���� Ȯ��
		System.out.println("4.SQL�� ���� OK....");
		
		
	}

}
