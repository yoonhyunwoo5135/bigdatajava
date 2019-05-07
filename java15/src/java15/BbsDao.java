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
	//각각을 메소드로 만들어야 한다.
	//SQL문 select * from bbs where id = ?
	public BbsDto select(String inputId) {
		try {
			//1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok...");
			//2.DB연결
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK...");
			//3.SQL문 설정(객체화)
			String sql = "select * from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1 , inputId);
			System.out.println("3. SQL문 객체화 OK...");
			//4.SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 OK...");
			//SQL문의 결과가 있으면, 받아서 처리
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
				System.out.println("검색 결과가 없습니다.");
			}
			
			
		} catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			System.out.println(e.getMessage());
		}
		finally {
			//에러 발생여부와 상관 없이 무조건 실행시켜야 하는 코드
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace(); 써도 안써도 상관 없음.
				System.out.println("자원 해제 중 에러 발생");
			}//catch end
		}//try - catch - finally end
		return dto;
	}//select end
	public BbsDto delete(String inputId) {
		try {
			//1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok...");
			//2.DB연결
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK...");
			//3.SQL문 설정(객체화)
			String sql = "delete from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1 , inputId);
			System.out.println("3. SQL문 객체화 OK...");
			//4.SQL문 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 OK...");
			//SQL문의 결과가 있으면, 받아서 처리
			
		}
		catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			System.out.println(e.getMessage());
		}
		finally {
			//에러 발생여부와 상관 없이 무조건 실행시켜야 하는 코드
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace(); 써도 안써도 상관 없음.
				System.out.println("자원 해제 중 에러 발생");
			}//catch end
		}//try - catch - finally end
		return dto;
	}//delete end
	public BbsDto insert(BbsDto dto) {
		try {
			//1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok...");
			//2.DB연결
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK...");
			//3.SQL문 설정(객체화)
			String sql = "insert into bbs values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1 , dto.getId());
			ps.setString(2 , dto.getTitle());
			ps.setString(3 , dto.getContent());
			ps.setString(4 , dto.getEtc());
			System.out.println("3. SQL문 객체화 OK...");
			//4.SQL문 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 OK...");
			//SQL문의 결과가 있으면, 받아서 처리
		}
		catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			System.out.println(e.getMessage());
		}
		finally {
			//에러 발생여부와 상관 없이 무조건 실행시켜야 하는 코드
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace(); 써도 안써도 상관 없음.
				System.out.println("자원 해제 중 에러 발생");
			}//catch end
		}//try - catch - finally end
		return dto;
	}//insert end
	public BbsDto update(BbsDto dto) {
		try {
			//1.드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok...");
			//2.DB연결
			url = "jdbc:mysql://localhost:3306/bigdata";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK...");
			//3.SQL문 설정(객체화)
			String sql = "update bbs set id = ?, title = ?, content = ?, etc = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1 , dto.getId());
			ps.setString(2 , dto.getTitle());
			ps.setString(3 , dto.getContent());
			ps.setString(4 , dto.getEtc());
			System.out.println("3. SQL문 객체화 OK...");
			//4.SQL문 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 OK...");
			//SQL문의 결과가 있으면, 받아서 처리
		}
		catch (Exception e) {
			System.out.println("DB처리 중 에러발생...");
			System.out.println(e.getMessage());
		}
		finally {
			//에러 발생여부와 상관 없이 무조건 실행시켜야 하는 코드
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace(); 써도 안써도 상관 없음.
				System.out.println("자원 해제 중 에러 발생");
			}//catch end
		}//try - catch - finally end
		return dto;
	}//update end
	

}//class end
