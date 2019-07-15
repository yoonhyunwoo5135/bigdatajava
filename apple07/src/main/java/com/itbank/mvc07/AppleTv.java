package com.itbank.mvc07;

public class AppleTv implements Tv {
	@Override
	public void powerOn() {
		System.out.println("애플 TV를 켜다");
	}
	@Override
	public void powerOff() {
		System.out.println("애플 TV를 끄다");
	}
	@Override
	public void volumeUp() {
		System.out.println("애플 TV 볼륨 Up");		
	}
	@Override
	public void	volumeDown() {
		System.out.println("애플 TV 볼륨 Down");
	}
}
