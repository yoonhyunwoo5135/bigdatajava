package control;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		/* 1.두수를 입력 받으세요.
		 * 누가 더 큰지 판별하여 프린트.
		 * 
		 * 2.두 수를 입력 받으세요.
		 * 4칙 연산을 하여 프린트.(+,_,*,/)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("4칙 연산");
		
		System.out.print("A: ");
		double a = sc.nextDouble();
		
		System.out.print("B: ");
		double b = sc.nextDouble();
		
		System.out.println("더하기는 1, 빼기는 2, 곱하기는 3, 나누기는 4를 입력하세요");
		int Q = sc.nextInt();
		
		if(Q == 1){
			System.out.println(a + b);
				
		}
		else if(Q == 2) {
			System.out.println(a - b);
		
		}
		else if(Q == 3){
			System.out.println(a * b);
		
		}
		else if(Q == 4) {
			System.out.println(a / b);
			
		}
		else {
			System.out.println("무엇인가 잘못 되었습니다.");
			
		}
		
		
	}//main end

}//class end
