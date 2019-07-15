package com.itbank.mvc07;

public class KoreaCook implements Cook{

	@Override
	public void fire() {
		System.out.println("불을 사용하다.");
	}

	@Override
	public void knife() {
		System.out.println("칼을 사용하다.");
	}	
	
}
