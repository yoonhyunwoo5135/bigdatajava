package tables;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Main {
	static String url;
	static String user;
	static String password;
	static Connection con;
	static PreparedStatement ps;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Test");
		
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("����̹� ���� ����...");
					url = "jdbc:mysql://localhost:3306/cafe";
					user = "root";
					password = "1234";
					System.out.println("�����ͺ��̽� ���� ����...");
					
					con = DriverManager.getConnection(url, user, password);
					String sql = "update inven set bean = bean ?, cup = cup ?, straw = straw ?";
					ps = con.prepareStatement(sql);
					ps.setInt(1, -2);
					ps.setInt(2, -1);
					ps.setInt(3, -1);
					System.out.println("sql�� ���� ����...");
					
					ps.executeUpdate();
					System.out.println("sql�� ���� �Ϸ�...");
					}
				catch(Exception e2) {
					e2.printStackTrace();
				}
				}
			
		});
		b1.setBounds(152, 193, 97, 31);
		f.getContentPane().add(b1);
		
		
		
		
		
		
		f.setVisible(true);
	}
}
