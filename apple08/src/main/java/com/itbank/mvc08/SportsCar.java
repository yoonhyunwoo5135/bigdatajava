package com.itbank.mvc08;

public class SportsCar implements Car {
	
	Window window;//주소 값을 생성
	Door door;
	
	public SportsCar() {
	}
	
	
	public void setSportsCar(Window window, Door door) { 
		this.window = window;
		this.door = door;
	}
	 
	public void setWindow(Window window) {
		this.window = window;
	}
	
	public void setDoor(Door door) {
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
