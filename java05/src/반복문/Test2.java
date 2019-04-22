package 반복문;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int num1 = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		System.out.print("숫자: ");
		int num2 = sc.nextInt();
		
		
		while(num1 <= num2) {
			num1++;
			System.out.print("★");
		}
		
	}

}
