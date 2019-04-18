package control;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		/* 1.두수를 입력 받으세요.
		 * 누가 더 큰지 판별하여 프린트.
		 * 
		 * 2.두 수를 입력 받으세요.
		 * 4칙 연산을 하여 프린트.(+,_,*,/)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수 중 더 큰 수는?");
		
		System.out.print("A: ");
		double a = sc.nextDouble();
		
		System.out.print("B: ");
		double b = sc.nextDouble();
		
		if(a > b){
			System.out.println("A 입니다.");
				
		}
		else if(a < b) {
			System.out.println("B 입니다.");
			
		}
		else {
			System.out.println("두 수는 같습니다.");
		}
		
		
	}

}
