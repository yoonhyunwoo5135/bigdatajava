package window;

import java.util.Date;

public class Test5 {

	public static void main(String[] args) {
		
		/* date.getYear()는 연도를 구해줌. 1900을 더해주어야 함.
		 * 앞으로 2222년이 되려면 몇년이 남았나? 계산
		*/
		Date date = new Date();
		int year = date.getYear() + 1900;
		int year2 = 2222;
		int result3 = year2 - year;
		
		System.out.println("2222년이 되려면 " + result3+ "년이 남았습니다.");
		
		
	}
	
}

