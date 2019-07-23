package com.itbank.mvc10;

import org.springframework.stereotype.Component;

@Component("b")
public class BSite {
	public void search() {
		System.out.println("물건 검색");
	}
	public void bascket() {
		System.out.println("장바구니");
	}
	public void order() {
		System.out.println("주문");
	}
}
