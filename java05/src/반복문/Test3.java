package 반복문;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자3 : ");
		int num3 = sc.nextInt();
		
		int result = num1 + num2 + num3;
		
		System.out.println("세 수의 합은 : " + result);
		
	}

}
