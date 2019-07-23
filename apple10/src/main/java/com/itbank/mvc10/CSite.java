package com.itbank.mvc10;

import org.springframework.stereotype.Component;

@Component("c")
public class CSite {
	public void orderInfo() {
		System.out.println("주문정보보기");
	}
	public void check() {
		System.out.println("확인");
	}
}
