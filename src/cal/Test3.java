package cal;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은?");
		String name = sc.next();
		
		System.out.print("당신의 태어난 연도는?");
		int year = sc.nextInt();
		int age = 2019 - year + 1;
		
		System.out.print("당신의 관심과목은?");
		String sub = sc.next();
		
		System.out.println("-------------");		
		System.out.println(name + "님은 " + year + "살 이고 " + sub + "에 관심이 있습니다.");
		
		
		
		
		
		
		
	}

}
