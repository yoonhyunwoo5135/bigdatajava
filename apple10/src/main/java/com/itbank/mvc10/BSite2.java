package com.itbank.mvc10;

import org.springframework.stereotype.Component;

@Component("b2")
public abstract class BSite2 implements BInterface{

	public String productFind(String name, int price) {
		System.out.println(name + "물건 검색하다.");
		System.out.println("가격은" + price + "원");
		return "ok";
	}

	@Override
	public void basket() {
		int [] num = {1, 2};
		num[2] = 3;
		System.out.println("장바구니에 담다");
	}

	@Override
	public void productOrder() {
		System.out.println("주문하다");
	}
	
}
