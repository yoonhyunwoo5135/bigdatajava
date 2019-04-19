package window;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		System.out.print("성적을 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		String grade = sc.next();
		char grade2 = grade.charAt(0);
		
		
		if(grade2 == 'A') {
			System.out.println("최우수 입니다.");
		}
		else if(grade2 == 'B') {
			System.out.println("우수입니다.");
		}
		else if(grade2 == 'C') {
			System.out.println("보통입니다.");
		}
		else {
			System.out.println("통과하지 못했습니다.");
		}

		
		
	}
	
}

