package com.itbank.mvc00;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest2 {

	public static void main(String[] args) {
		ApplicationContext user = new GenericXmlApplicationContext("context.xml");
		ICook cook = (ICook)user.getBean("kc");
		CookManager ic = new CookManager(cook);
		
		ic.orderRice();
		ic.orderSoup();
		
	}
}
