package com.itbank.mvc08;

public class StrongWindow implements Window {
	
	Window window;
	
	public StrongWindow() {
	}
	
	public StrongWindow(Window window) {
		this.window = window;
	}
	
	@Override
	public void open() {
		System.out.println("강화유리 열려요");
	}

	@Override
	public void close() {
		System.out.println("강화유리 닫혀요");
	}

}
