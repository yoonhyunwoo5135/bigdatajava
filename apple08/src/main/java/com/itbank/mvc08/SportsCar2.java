package com.itbank.mvc08;

public class SportsCar2 implements Car {
	
	Window window;//주소 값을 생성
	String color;
	int speed;
	
	
	public SportsCar2() {
	}
	
	public void setWindow(Window window, String color, int speed) { 
		this.window = window;
		this.color = color;
		this.speed = speed;
	}
	
	
	public Window getWindow() {
		return window;
	}


	public void setWindow(Window window) {
		this.window = window;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	@Override
	public void open() {
		window.open();
		System.out.println("차의 색깔은" + color);
		System.out.println("차의 속력은" + speed);
	}

	@Override
	public void close() {
		window.close();
	}

}
