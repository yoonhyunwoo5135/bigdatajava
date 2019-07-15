package com.itbank.mvc00;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest {

	public static void main(String[] args) {
		ApplicationContext user = new GenericXmlApplicationContext("context.xml");
		ICook ic = (ICook)user.getBean("cc");
		ic.makeRice();
		ic.makeSoup();
		ic.makeSalad();
		ic.makeSource();
		ICook ic2 = (ICook)user.getBean("kc");
		ic2.makeRice();
		ic2.makeSoup();
		ic2.makeSalad();
		ic2.makeSource();
	}
}
