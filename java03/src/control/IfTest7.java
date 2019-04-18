package control;

import java.util.Scanner;

public class IfTest7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String result;

		System.out.println("당신의 학점은?");
		System.out.println("당신의 점수를 입력하세요");
		int grade = sc.nextInt();

		if (grade >= 90) {
			result = "A";

		} else if (grade >= 80) {
			result = "B";

		} else if (grade >= 70) {
			result = "C";

		} else if (grade >= 60) {
			result = "D";

		} else {
			result = "F";

		}
		System.out.println("당신의 학점은" + result + "입니다.");
	}// main end

}// class end
