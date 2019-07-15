package com.itbank.mvc00;

public class KoreanCook implements ICook{

	@Override
	public void makeRice() {
		System.out.println("밥 만");		
	}

	@Override
	public void makeSoup() {
		System.out.println("스프 만");		
	}

	@Override
	public void makeSalad() {
		System.out.println("샐러드 만");		
	}

	@Override
	public void makeSource() {
		System.out.println("소스 만");		
	}

	

}
