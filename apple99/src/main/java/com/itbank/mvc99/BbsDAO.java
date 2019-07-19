package com.itbank.mvc99;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(BbsDTO bbsDTO) {
		my.insert("bDAO.insert", bbsDTO);
	}
}
