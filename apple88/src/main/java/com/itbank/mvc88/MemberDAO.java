package com.itbank.mvc88;

import org.mybatis.spring.SqlSessionTemplate;

public class MemberDAO {
	
	SqlSessionTemplate myBatis;
	
	public MemberDAO(SqlSessionTemplate myBatis) {
		this.myBatis = myBatis;
	}
	
	public void insert(MemberDTO memberDTO) {
		myBatis.insert("mDAO.insert", memberDTO);
	}
}
