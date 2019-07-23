package com.itbank.flower;

import org.springframework.stereotype.Component;

@Component("f")
public class FlowerShop implements Ainterface {

	@Override
	public void member(String name) {
		System.out.println(name + "님 환영합니다.");
	}

	@Override
	public void buy(String name, int price) {
		System.out.println(name + "님 구매금액은 " + price + "입니다.");
	}

	@Override
	public void iDontknow() {
		int [] num = {1,2};
		num[2] = 3;
	}

	@Override
	public void welcome() {
		System.out.println("반갑습니다.");
	}

	@Override
	public void explorer() {
		System.out.println("쇼핑몰 투어 중입니다.");
		for (int i = 0; i < 1000000; i++) {
			System.out.print("");
		}
	}
	
}
