package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	DBConnectionMgr mgr;
	BbsDTO dto2 = null;
	
	public BbsDAO() {
		mgr = DBConnectionMgr.getInstance();		
	}
	
	public void insert(BbsDTO dto) throws Exception {
		
		//1,2단계를 해주는 DBconnectionMgr 객체 필요
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "insert into bbs values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getEtc());
		
		//4단계 sql문 전달 요청
		ps.executeUpdate();
	}
	public void update(BbsDTO dto) throws Exception {
		
		//1,2단계를 해주는 DBconnectionMgr 객체 필요
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "update bbs set id =?, title = ?, content = ?, etc = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getEtc());
		ps.setString(5, dto.getId());
		
		//4단계 sql문 전달 요청
		ps.executeUpdate();
	}
	public BbsDTO select(BbsDTO dto) {
		
		//1,2단계를 해주는 DBconnectionMgr 객체 필요
		try {
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con;
			con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "select * from bbs where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		//4단계 sql문 전달 요청
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			dto2 = new BbsDTO();
			String id = rs.getString(1);
			String title = rs.getString(2);
			String content = rs.getString(3);
			String etc = rs.getString(4);
			
			dto2.setId(id);
			dto2.setTitle(title);
			dto2.setContent(content);
			dto2.setEtc(etc);
		}
		ps.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto2;
	}
	
}
