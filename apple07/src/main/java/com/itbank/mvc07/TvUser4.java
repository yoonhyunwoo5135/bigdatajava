package com.itbank.mvc07;

public class TvUser4 {
	
	public static void main(String[] args) {
		FactoryBean factory = new FactoryBean();
		
		Tv tv = (Tv)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
