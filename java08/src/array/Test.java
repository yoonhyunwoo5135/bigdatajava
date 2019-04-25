package array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		
		System.out.println("수강신청을 진행합니다.");
		System.out.println("원하는 과목을 선택하세요");
		
		while(true){			
			System.out.println("-------------------------------------");
			System.out.println("1)자바  2)스프링  3)안드로이드  4)파이썬  5)제이쿼리");
			System.out.println("-------------------------------------");
		
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + "\t");
			}
			
			System.out.println();
			System.out.println("=====================================");
			System.out.println("원하는 과목 코드를 입력하세요(종료 0) ==>");
			int sub = sc.nextInt();
			int sub1 = sub;
			
			if(sub1 == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}//if end
			
			else {
				int sub2 = num[sub-1];
				if(sub2 == 1) {
						for (int k = 0; k < num.length; k++) {
							System.out.print(num[k] + "  ");
						}
						System.out.println();
						System.out.println("신청 불가능 합니다.");
						System.out.println("다시 선택해주세요");
				}//if end
						
				else if(sub2 == 0) {
							
					for (int j = 0; j < num.length; j++) {
						num[sub-1] = 1;
						System.out.print(num[j] + "  ");
					}//for end
					System.out.println();
					System.out.println("신청 완료 되었습니다.");
							
					}//else if end
						
				}//else end
			
		}//while end
		
	}//main end

}//class end
