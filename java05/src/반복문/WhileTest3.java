package 반복문;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		//두개의 입력 값을 받아서,
		//첫번째값부터 두번째값까지 더함.
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		System.out.print("숫자 1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력: ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		while(num1 <= num2) {//조건식
			//더하는 식.
			//증감식
			sum = sum + num1;
			num1++;
			
		}
		System.out.println(num1 + "과 " + num2 + "의 합은 " + sum);
	}

}
