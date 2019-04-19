package window;

import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int day = date.getDay();
		
		String result = "";
		String result2 = "";
		switch(day) {
		case 1 :
			result = "월요일";
			result2 = "너무 이른날";break;
		case 2 :
			result = "화요일";
			result2 = "너무 성급한 날";break;
		case 3 :
			result = "수요일";
			result2 = "뭔가 어정쩡한 날";break;
		case 4 :
			result = "목요일";
			result2 = "그냥 왠지 싫은 날";break;
		case 5 :
			result = "금요일";
			result2 = "금요일에 시간 어때요";break;
		case 6 :
			result = "토요일";
			result2 = "주말이다!";break;
		default :
			result = "일요일";
			result2 = "주말2다!!"; break;
		
		}
		
		System.out.println("오늘은 " + result + " " + result2);
		
		
	}
	
}

