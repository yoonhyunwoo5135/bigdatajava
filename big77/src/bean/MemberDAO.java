package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	DBConnectionMgr mgr;
	MemberDTO dto2 = null;
	
	public MemberDAO() {
		mgr = DBConnectionMgr.getInstance();		
	}
	
	public void insert(MemberDTO dto) throws Exception {
		
		//1,2단계를 해주는 DBconnectionMgr 객체 필요
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "insert into member values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		//4단계 sql문 전달 요청
		ps.executeUpdate();
	}
	public void update(MemberDTO dto) throws Exception {
		
		//1,2단계를 해주는 DBconnectionMgr 객체 필요
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "update member set id =?, pw = ?, name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		ps.setString(5, dto.getId());
		
		//4단계 sql문 전달 요청
		ps.executeUpdate();
	}
	public MemberDTO select(MemberDTO dto) {
		
		//1,2단계를 해주는 DBconnectionMgr 객체 필요
		try {
		DBConnectionMgr mgr = DBConnectionMgr.getInstance();
		Connection con;
			con = mgr.getConnection();
		
		//3단계 sql문 결정
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		//4단계 sql문 전달 요청
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			dto2 = new MemberDTO();
			String id = rs.getString(1);
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);
			
			dto2.setId(id);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
		}
		ps.executeUpdate();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto2;
	}
}
