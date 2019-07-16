package com.itbank.mvc08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarUser {
	
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");//경로 지정 안하면 defalut값은 resource 밑으로 잡힘.
		Car car = (Car)factory.getBean("sportscar");
		car.open();
		car.close();
		
		ApplicationContext factory2 = new GenericXmlApplicationContext("context.xml");//경로 지정 안하면 defalut값은 resource 밑으로 잡힘.
		Car car2 = (Car)factory2.getBean("supercar");
		car2.open();
		car2.close();

	}
}
