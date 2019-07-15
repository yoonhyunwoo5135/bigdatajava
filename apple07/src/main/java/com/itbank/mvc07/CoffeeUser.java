package com.itbank.mvc07;

public class CoffeeUser {
	
	public static void main(String[] args) {
		//추상클래스는 업캐스팅이 대상이 된다.
		//인터페이스는 업캐스팅이 대상이 된다.
		//추상클래스와 인터페이스는 타입으로 쓸 수 있다.
		ShopCoffee shop = new MyShopCoffee();
		shop.make();
		shop.pay();
		shop.prepare();
		
		TruckCoffee truck = new TruckCoffee();
		truck.make();
		truck.pay();
		
	}
}
