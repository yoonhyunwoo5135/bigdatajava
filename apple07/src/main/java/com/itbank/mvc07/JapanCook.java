package com.itbank.mvc07;

public class JapanCook implements Cook{

	@Override
	public void fire() {
		System.out.println("불로 조림하다");
	}

	@Override
	public void knife() {
		System.out.println("회를 썰다");
	}
	
}
