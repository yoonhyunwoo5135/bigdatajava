package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarDao {

	String url;
	String user;
	String password;
	Connection con;
	ResultSet rs;
	PreparedStatement ps;

	CarDto dto = null;

	public CarDto insert(CarDto dto) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정 Ok...");
			url = "jdbc:mysql://localhost:3306/Car";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공...");
			String sql = "insert into carsale values(?, ?, ?, ?)";
			ps = con.prepareStatement(sql);

			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getPrice());

			System.out.println("Sql문 객체화 성공...");

			ps.executeUpdate();
			System.out.println("sql문 전송 성공...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			} // catch end
		} // try - catch - finally end
		return dto;

	}

	public CarDto update(CarDto dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정 Ok...");
			url = "jdbc:mysql://localhost:3306/Car";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공...");
			String sql = "update carsale set id = ?, name = ?, content = ?, price = ?";
			ps = con.prepareStatement(sql);

			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getPrice());

			System.out.println("Sql문 객체화 성공...");

			ps.executeUpdate();
			System.out.println("sql문 전송 성공...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			} // catch end
		} // try - catch - finally end
		return dto;

	}

	public CarDto delete(CarDto dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정 Ok...");
			url = "jdbc:mysql://localhost:3306/Car";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공...");
			String sql = "delete from carsale where id = ?";
			ps = con.prepareStatement(sql);

			ps.setString(1, dto.getId());

			System.out.println("Sql문 객체화 성공...");

			ps.executeUpdate();
			System.out.println("sql문 전송 성공...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			} // catch end
		} // try - catch - finally end
		return dto;

	}

	public ArrayList selectAll() {
		ArrayList list = new ArrayList();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 설정 Ok...");
			url = "jdbc:mysql://localhost:3306/Car";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공...");
			String sql = "select * from carsale";
			ps = con.prepareStatement(sql);
			System.out.println("Sql문 객체화 성공...");

			rs = ps.executeQuery();
			System.out.println("sql문 전송 성공...");
			
			while (rs.next()) {
				dto = new CarDto();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			} // catch end
		} // try - catch - finally end
		return list;
	}

	public static void main(String[] args) {
		CarDao dao = new CarDao();

	}
}
