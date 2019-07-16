package com.itbank.mvc08;

public class GeneralDoor implements Door {
	
	@Override
	public void doorOpen() {
		System.out.println("일반문이 열려요");
	}
	
	@Override
	public void doorClose() {
		System.out.println("일반문이 닫혀요");
	}

}
