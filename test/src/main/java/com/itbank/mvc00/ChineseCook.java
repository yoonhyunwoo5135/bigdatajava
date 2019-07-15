package com.itbank.mvc00;

public class ChineseCook implements ICook{

	@Override
	public void makeRice() {
		System.out.println("밥 만들기");
	}

	@Override
	public void makeSoup() {
		System.out.println("국 만들기");
	}

	@Override
	public void makeSalad() {
		System.out.println("샐러드 만들기");
	}

	@Override
	public void makeSource() {
		System.out.println("소스 만들기");
	}



}
