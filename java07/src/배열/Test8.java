package 배열;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[] java = new int[3];
		int[] spring = new int[3];
				
		for (int i = 0; i < name.length; i++) {
			System.out.print("학생의 이름을 입력하세요");
			name[i] = sc.next();
		}		
		for (int j = 0; j < java.length; j++) {
			System.out.println(name[j] + "학생의  자바 점수를 입력하세요");
			java[j] = sc.nextInt();
		}
		System.out.println();
		for (int k = 0; k < spring.length; k++) {
			System.out.println(name[k] +"학생의  스프링 점수를 입력하세요");
			spring[k] = sc.nextInt();
			
		}
		
		int max = java[0];
		int min = spring[0];
		
		System.out.println("학생 이름: " + name[0]);
		System.out.println("학생점수(자바): " + java[0]);
		System.out.println("학생점수(스프링): " + spring[0]);

		System.out.println();
		
		System.out.println("학생 이름: " + name[1]);
		System.out.println("학생점수(자바): " + java[1]);
		System.out.println("학생점수(스프링): " + spring[1]);
		
		System.out.println();
		
		System.out.println("학생 이름: " + name[2]);
		System.out.println("학생점수(자바): " + java[2]);
		System.out.println("학생점수(스프링): " + spring[2]);
		
		System.out.println("======================================");
		
		System.out.println("세 학생의 이름은 " + name[0] + ", " + name[1] + ", " + name[2]);
		System.out.println();
		
		for (int i = 0; i < java.length; i++) {
			if(max < java[i]) {
				max = java[i];
			}
		}
		for (int k = 0; k < spring.length; k++) {
			if(min < spring[k]) {
				min = spring[k];
				}
		}
	}

}
