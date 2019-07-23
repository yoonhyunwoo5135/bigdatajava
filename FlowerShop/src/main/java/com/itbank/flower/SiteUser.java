package com.itbank.flower;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext factory
		= new GenericXmlApplicationContext("aopContext.xml");
	Ainterface flower = (Ainterface)factory.getBean("f");
	flower.welcome();
	flower.member("yoon");
	flower.buy("yoon", 10000);
	flower.explorer();
	flower.iDontknow();
	
	factory.close();
	}
	
}
