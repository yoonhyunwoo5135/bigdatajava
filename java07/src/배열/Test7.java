package 배열;

import java.util.Scanner;

public class Test7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		String[] vote = new String[3];
		int[] result = new int[3];
		for (int i = 0; i < name.length; i++) {
			System.out.print("가수 이름을 입력하세요>>");
			name[i] = sc.next();
		}
		System.out.println(name[0] + ", " + name[1] + ", " + name[2]);
		
		for (int j = 0; j < vote.length; j++) {
			vote[j] = name[j];
			System.out.print((j+1) + ") " + name[j] + "  ");
		}
		System.out.println();
		for (int k = 0; k < 6; k++) {
			System.out.print("투표 번호>> ");
			int vote2 = sc.nextInt();
			System.out.println("1) " + name[0] + " 2) " + name[1] + " 3) " + name[2]);
			
			if(vote2 == 1) {
				result[0]++;
			}
			else if(vote2 == 2) {
				result[1]++;
			}
			else if(vote2 == 3) {
				result[2]++;
			}
			
		}
		System.out.println();
		System.out.println(name[0] + ": "+ result[0]);
		System.out.println(name[1] + ": " + result[1]);
		System.out.println(name[2] + ": " + result[2]);
	}

}
