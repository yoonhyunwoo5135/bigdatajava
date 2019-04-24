package 배열;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print("성적을 입력하세요>>");
			num[i] = sc.nextInt();
		}
		int result = (num[0] + num[1] + num[2] + num[3] + num[4]) / 5;
		System.out.println("평균 성적은 " + result + "입니다.");
		
		
		
		
		sc.close();
	}
}
