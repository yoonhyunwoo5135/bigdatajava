package com.itbank.flower;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AspectClass {
	public void welcome() {
		System.out.println("환영합니다.");
	}
	public void errorCall() {
		System.out.println("알 수 없는 에러 입니다.");
	}
	public void aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch watch = new StopWatch();
		System.out.println("쇼핑몰 투어 시작");
		watch.start();
		pjp.proceed();
		watch.stop();
		System.out.println("쇼핑몰 투어 끝");
		System.out.println("쇼핑몰 투어 시간은 " + watch.getTotalTimeMillis() + "입니다.");
	}
}
