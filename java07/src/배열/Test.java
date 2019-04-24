package 배열;

import java.util.Scanner;

public class Test {
	//1. java, jsp, spring을 입력 받아서,
	//**java보다는 spring**출력
	
	//2. 100, 200, 300을 입력 받아서
	//100 + 300은 400입니다. 출력
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] string = new String[3];
		
		for (int i = 0; i < string.length; i++) {
			System.out.print("입력: ");
			string[i] = sc.next();
			
		}
		
		System.out.println("**" + string[0] + "보다는 " + string[2] + "**");
		
		int [] num = new int[3];
			
		for (int i = 0; i < num.length; i++) {
			System.out.print("입력: ");
			num[i] = sc.nextInt();
				
		}
		int result = num[0] + num[2];
			
		System.out.println(num[0] + " + " + num[2] + "은 " + result + "입니다.");
		
	}

}
