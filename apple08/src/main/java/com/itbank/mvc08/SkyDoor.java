package com.itbank.mvc08;

public class SkyDoor implements Door {

	@Override
	public void doorOpen() {
		System.out.println("하늘문이 열려요");
	}

	@Override
	public void doorClose() {
		System.out.println("하늘문이 닫혀요");
	}

}
