package window;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//영어로 굿 모닝, 굿 에프터 눈, 굿 이브닝, 굿 나잇 나오게
		
		Date date = new Date();
		int hour = date.getHours();
		
		if(hour < 12) {
			System.out.println("Good Mornig!");
		}
		else if(hour < 20) {
			System.out.println("Good Afternoon!");
		}
		else if(hour <24) {
			System.out.println("Good Evning");
		}
		else {
			System.out.println("Good night");
		}
		
		
	}

}
