package com.itbank.mvc06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.DBConnectionMgr;

@Repository
public class BbsDAO {
	
	DBConnectionMgr dbcp;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//기본 생성자
	//생성자: 객체 생성시 자동 호출되는 메소드
	//객체생성시 꼭 해주어야하는 초기화 과정
	public BbsDAO() {
		dbcp = DBConnectionMgr.getInstance();
	}
	
	public void insert(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "insert into bbs values (?,?,?,?)";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
	
	public void delete(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();
		
		//3. SQL문 객체화
		String sql = "delete from bbs where id = ?";
		ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getId());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
	public BbsDTO select(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "select * from bbs where id = ?";
		
		ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getId());
		
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
		dto = new BbsDTO();
		String id = rs.getString(1);
		String title = rs.getString(2);
		String content = rs.getString(3);
		String writer = rs.getString(4);
		
		dto.setId(id);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setWriter(writer);
		}
		
		return dto;
	}
	public void update(BbsDTO dto) throws Exception {
		con = dbcp.getConnection();

		//3. SQL문 객체화
		String sql = "update bbs set id = ? , title = ?, content = ?, writer = ? where id = ?";
		ps = con.prepareStatement(sql);

		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());
		ps.setString(5, dto.getSelectId());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
	}
}
