package com.itbank.mvc07;

public class CookUser {
	
	public static void main(String[] args) {
		Cook kc = new KoreaCook();
		kc.fire();
		kc.knife();
		
		Cook jc = new JapanCook();
		jc.fire();
		jc.knife();
	}
	
}
