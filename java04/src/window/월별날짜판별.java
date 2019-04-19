package window;

import java.util.Date;

public class 월별날짜판별 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDate();
		
		String result = "";
		
		switch(month){
		case 2:
			result = "28"; break;
			
		case 4: case 6: case 9: case 11:
			result = "30"; break;
			
		default:
			result = "31"; break;
		}
		
	
		
		System.out.println("지금은 " + result + "까지 있는 달입니다.");
		System.out.println("지금은 " + month + "월, " + day + "일 입니다.");
	}
	
}
