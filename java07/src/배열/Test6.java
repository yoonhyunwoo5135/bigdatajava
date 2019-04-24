package 배열;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int sum = 0;
		int result = 0;
				
		System.out.println("------------------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(i+1 + "  ");
		}
		System.out.println();
		System.out.println("------------------------------------------");
		
			
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + "  ");
		}
		
		while(true) {
			System.out.println();
			System.out.println("------------------------------------------");
			System.out.println();
			System.out.println("원하시는 좌석 번호를 입력하세요 (종료는 -1)");
			int num = sc.nextInt();
			int seat1 = num;
			if(seat1 == -1){
				break;
			}
			else {
				int seat2 = seat[num-1];
			
				if(seat2 == 1) {
					for (int i = 0; i < seat.length; i++) {
						System.out.print(seat[i] + "  ");
					}
					System.out.println();
					System.out.println("이미 예약된 좌석입니다.");
					
				}
				
				else if(seat2 == 0){
					seat[num-1] = 1;
					for (int i = 0; i < seat.length; i++) {
						System.out.print(seat[i] + "  ");
					}
						System.out.println();
						System.out.println("예매 되었습니다.");
						result++;
						sum = sum + 10000;
						}
				}
						
			}
		System.out.println("예매 시스템을 종료합니다.");
		System.out.println("예약 한 좌석 수: " + result);
		System.out.println("영화 비용: " + sum);
		
	}

}
