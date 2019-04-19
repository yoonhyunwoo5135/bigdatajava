package window;

import java.util.Date;

import javax.xml.crypto.Data;

public class 날짜테스트 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재 시각은" + hour);
		
		int minute = date.getMinutes();
		System.out.println("현재 분은" + minute);
	
		int second = date.getSeconds();
		System.out.println("현재 초는" + second);
		
		
	}

}
