package window;

import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;
		
		String result = "";
		
		switch(month) {
		case 3: case 4: case 5:
			result = "봄"; break;
		}
		switch(month) {
		case 6: case 7: case 8:
			result = "여름"; break;
		}
		switch(month) {
		case 9: case 10: case 11:
			result = "가을"; break;
		}
		switch(month) {
		default:  
			result = "겨울"; break;
		}
		
		
		System.out.println("지금은 " + month + "월, " + result + "입니다.");
	}
	
}

