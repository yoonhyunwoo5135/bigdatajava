package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DbTest {
	public static void main(String[] args) throws Exception {
//		1.드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//데이터베이스 => 드라이버관리자 => 사용하는 DB선택 => class name 복사
		System.out.println("1.드라이버 설정 OK....");
//		2.DB연결(DB명, id, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";//패키지명:DBSW://localhost:port/데이터이름 => mySQL들어가서 Driver properties가면 확인 가능
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);//연결, 연동
		System.out.println("2.DB연결 OK....");
//		3.SQL문 결정
		String id = JOptionPane.showInputDialog("ID입력");
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		
//		String sql = "insert into member values('"+ id +"','"+ pw +"','"+ name +"', '"+ tel +"')";//SQL문 사용하여 데이터 삽입
		String sql = "insert into member values(?,?,?,?)";//SQL문 사용하여 데이터 삽입, '?' 사용 금지
		PreparedStatement ps = con.prepareStatement(sql);//SQL문으로 변경 하는 것
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3.SQL문 결정 OK....");
//		객체화
//		String url1 = "http://www.naver.com";
//		URL url2 = new URL(url1);
		
		
//		4.SQL전송
		ps.executeUpdate();//전송 확인
		System.out.println("4.SQL문 전송 OK....");
		
		
	}

}
