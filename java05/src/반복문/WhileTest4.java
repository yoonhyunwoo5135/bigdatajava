package 반복문;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		//두개의 입력 값을 받아서,
		//첫번째값부터 두번째값까지 더함.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		System.out.print("숫자 1은: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2는: ");
		int num2 = sc.nextInt();
		
		int mul = 1;
		while(num1 <= num2) {
			mul = mul * num1;
			num1++;
			
			
		}
		System.out.println(num1 + "부터 " + num2 + "까지의 숫자를 모두 곱한 수는 " + mul);
	
	
	}

		

}
