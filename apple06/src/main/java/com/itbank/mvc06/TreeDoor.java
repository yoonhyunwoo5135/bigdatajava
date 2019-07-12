package com.itbank.mvc06;

public class TreeDoor implements Door {

	@Override
	public void open() {
		System.out.println("나무문 open");
	}

	@Override
	public void close() {
		System.out.println("나무문 close");
	}

	@Override
	public void key() {
		System.out.println("나무문 key");
	}

	@Override
	public void made() {
		System.out.println("나무문 made");
	}

}
