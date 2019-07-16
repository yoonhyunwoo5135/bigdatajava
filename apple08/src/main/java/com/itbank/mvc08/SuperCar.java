package com.itbank.mvc08;

public class SuperCar implements Car {

	Window window;
	Door door;
	
	public SuperCar() {
		
	}
	
	public SuperCar(Window window, Door door) {
		this.window = window;
		this.door = door;
	}
	
	@Override
	public void open() {
		window.open();
		door.doorOpen();
	}

	@Override
	public void close() {
		window.close();
		door.doorClose();
	}

}
