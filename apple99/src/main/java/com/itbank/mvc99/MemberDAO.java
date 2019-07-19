package com.itbank.mvc99;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MemberDTO memberDTO) {
		my.insert("mDAO.insert", memberDTO);
	}
}
