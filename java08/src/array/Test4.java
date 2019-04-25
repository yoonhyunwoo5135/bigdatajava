package array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		
		System.out.println("--------콘도예약을 진행합니다.--------");
		System.out.println("원하는 지역을 신청해주세요(각 지역은 2명까지 가능)");
		
		while(true){			
			System.out.println("-------------------------------------");
			System.out.println("1)강원도  2)전라도  3)파주  4)제주도  5)충청도");
			System.out.println("-------------------------------------");
		
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + "\t");
			}
			
			System.out.println();
			System.out.println("=====================================");
			System.out.println("원하는 지역 코드를 입력하세요(종료 0) ==>");
			int travel = sc.nextInt();
			int travel1 = travel;
			
			if(travel1 == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}//if end
			
			else {
				int travel2 = a[travel-1];
				if(travel2 == 2) {
						for (int k = 0; k < a.length; k++) {
							System.out.print(a[k] + "  ");
						}
						System.out.println();
						System.out.println("이미 인원이 찼습니다.");
						System.out.println("다시 선택해주세요");
				}//if end
						
				else if(travel2 == 1) {
							
					for (int j = 0; j < a.length; j++) {
						a[travel-1] = 2;
						System.out.print(a[j] + "  ");
					}//for end
					System.out.println();
					System.out.println("신청이 완료 되었습니다.");
							
					}//else if end
				else if(travel2 == 0) {
					
					for (int j = 0; j < a.length; j++) {
						a[travel-1] = 1;
						System.out.print(a[j] + "  ");
					}//for end
					System.out.println();
					System.out.println("신청이 완료 되었습니다.");
					
				}//else if end
						
				}//else end
			
		}//while end
		
	}//main end

}//class end
