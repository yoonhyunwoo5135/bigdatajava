package com.itbank.mvc10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser {

	public static void main(String[] args) {
		ApplicationContext factory
			= new GenericXmlApplicationContext("aopContext.xml");
		ASite a = (ASite)factory.getBean("a");
		a.personalInfo();
		
		ApplicationContext factory2
		= new GenericXmlApplicationContext("aopContext.xml");
		BSite b = (BSite)factory2.getBean("b");
		b.search();
		b.bascket();
		b.order();
		
		ApplicationContext factory3
		= new GenericXmlApplicationContext("aopContext.xml");
		CSite c = (CSite)factory3.getBean("c");
		c.orderInfo();
		c.check();
	}

}
