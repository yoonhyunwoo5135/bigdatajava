package array;

import java.util.Scanner;

public class 영화예매프로그램 {
	/* 1. 좌석번호를 1번 부터 표시
	 * 2. 행/열을 입력을 1번부터 입력
	 * 3. 행을 1번 부터 표시
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		int[][] seat = new int[3][11];
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("--------------------------------");
			System.out.print("*  ");
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + "열 ");
			}
			System.out.println();
			System.out.println("--------------------------------");
			for (int i = 0; i < seat.length; i++) {
				seat[0][0] = 1;
				seat[1][0] = 2;
				seat[2][0] = 3;
				System.out.print(seat[i][0] + "행  ");
				for (int j = 1; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "  ");
				}
				System.out.println();
			}
			System.out.print("종료 0, 예약 1>>");
			int end = sc.nextInt();
			if (end == 0) {
				System.out.println("시스템 종료...");
				break;
			}
			else {
				System.out.print("행 입력: ");
				int row = sc.nextInt();
				System.out.print("열 입력: ");
				int col = sc.nextInt();
				if(row > 3) {
					System.out.println("잘못 입력하였습니다. 다시 선택해주세요");
				}
				else if(col > 10) {
					System.out.println("잘못 입력하였습니다. 다시 선택해주세요");					
				}
				
				
				else if(seat[row-1][col] == 0) {
					seat[row-1][col] = 1;
					System.out.println("예약 완료");
				}
				else {
					System.out.println("예약이 이미 완료된 자리 입니다.");
					System.out.println("좌석을 재 입력 해주세요");
				}
				
				
			}
	
		}
	
	}

}
