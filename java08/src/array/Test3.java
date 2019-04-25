package array;

import java.util.Scanner;

public class Test3 {
	/*
	 * 김아무개 22
	 * 박아무개 11
	 * 송아무개 33
	 * 정아무개 44
	 * 장아무개 55
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] name = new String[5];
		int [] age = new int[5];
		int i;
		int j;
		int k;
		
		System.out.println("이름과 나이를 입력하세요");
		System.out.print("입력>>");
		for (i = 0; i < name.length; i++) {
			name[i] = sc.next();
			age[i] = sc.nextInt();			
		}
		System.out.println();
		System.out.println("전체 인원수는 " + name.length);
		
		System.out.println("파티 참석자 전체 명단 입니다.");
		for (j = 0; j < name.length; j++) {
			System.out.println("이름은: " + name[j] + "  나이는: " + age[j]);
		}
		for (k = 1; k < age.length; k++) {
			age[k] = age[k]+age[k-1];
		}
		double result = age[4] / age.length;
		System.out.println("파티 참석자의 평균 나이는? " + result + "세");
	}//main end

}//class end
