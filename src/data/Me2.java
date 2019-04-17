package data;

import java.util.Scanner;

public class Me2 {

	public static void main(String[] args) {
		//--------------------
		//당신의 취미는?
		//평소 TV시청 시간은 얼마인가요?
		//봄 여행을 다녀왔나요?
		//--------------------
		//내 취미는 여행이고, 평소에 TV를 2시간도 보지 않아요. 봄여행은 true에요.
		
		
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 취미는? ");
		String hobby = sc.next();
		
		System.out.print("평소 TV시청 시간은 얼마인가요?");
		int hour = sc.nextInt();
		
		System.out.print("봄여행을 다녀왔나요?");
		String travel = sc.next();
		
		System.out.println("--------------------");
		
		System.out.print("내 취미는 " + hobby + "이고 " + "평소에 TV를 " + hour + "시간도 보지 않아요. 봄 여행은" + travel + "에요.");
		
		
		
		
	}

	
			
}
