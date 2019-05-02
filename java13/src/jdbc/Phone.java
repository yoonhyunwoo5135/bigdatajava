package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Phone {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String id = JOptionPane.showInputDialog("id입력");
		String title = JOptionPane.showInputDialog("title입력");
		String price = JOptionPane.showInputDialog("price입력");
		String company = JOptionPane.showInputDialog("company입력");
		
		String sql = "insert into myphone values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, price);
		ps.setString(4, company);
		
		ps.executeUpdate();
	}

}
