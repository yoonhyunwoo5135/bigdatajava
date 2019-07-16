package com.itbank.mvc88;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BbsUser {
	
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");//경로 지정 안하면 defalut값은 resource 밑으로 잡힘.
		BbsDAO dao = (BbsDAO)factory.getBean("bbsDAO");
		BbsDTO bbsDTO = new BbsDTO();
		
		bbsDTO.setId("mybatis");
		bbsDTO.setPw("mybatis");
		bbsDTO.setName("mybatis");
		bbsDTO.setTel("mybatis");
		
		dao.insert(bbsDTO);
	}
}
