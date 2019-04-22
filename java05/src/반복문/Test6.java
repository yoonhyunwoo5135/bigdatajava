package 반복문;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

			System.out.println("봄(1), 여름(2), 가을(3), 겨울(4)");
			System.out.print("계절[1-4]을 입력하세요=>");
			
			while (true) {
				
			int season = sc.nextInt();

			if (season == 1) {
				System.out.println("계절은 봄 입니다."); break;
			}
			else if (season == 2) {
				System.out.println("계절은 여름 입니다."); break;
			}
			else if (season == 3) {
				System.out.println("계절은 가을 입니다."); break;
			}
			else if (season == 4) {
				System.out.println("계절은 겨울 입니다."); break;
			}
			else {
				System.out.print("계절[1-4]을 입력하세요=>");
			}

		}
		sc.close();
	}

}
