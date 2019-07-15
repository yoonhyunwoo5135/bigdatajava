package com.itbank.mvc07;

public class CherryTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("체리 TV를 켜다");
	}
	@Override
	public void powerOff() {
		System.out.println("체리 TV를 끄다");
	}
	@Override
	public void volumeUp() {
		System.out.println("체리 TV 볼륨 Up");		
	}
	@Override
	public void	volumeDown() {
		System.out.println("체리 TV 볼륨 Down");
	}

}
