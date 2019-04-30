package information;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Info[] man = new Info[3];
		int i;
		int result;
		int result1;
		for (i = 0; i < 3; i++) {
			String id = JOptionPane.showInputDialog("아이디를 입력하세요");
			String pw = JOptionPane.showInputDialog("비밀번호 입력하세요");
			String grade = JOptionPane.showInputDialog("등급을 입력하세요");
			String mileage2 = JOptionPane.showInputDialog("마일리지를 입력하세요");
			int mileage = Integer.parseInt(mileage2);
			man[i] = new Info(id, pw, grade, mileage);
		}
		
		System.out.println("회원 명단입니다.");
		System.out.println("============================");
		System.out.println("아이디" + "\t" + "비밀번호" + "\t" + "등급" + "\t" + "마일리지");
		System.out.println("----------------------------");
		for (i = 0; i < man.length; i++) {
			System.out.println(man[i]);
		}	
		System.out.println(man[0].id + "의 비밀번호는" + man[0].pw + "입니다.");
		System.out.println(man[1].id + "는 준관리자이고 마일리지는 " + man[1].mileage + "입니다.");
		System.out.println("총 마일리지는 " + (man[0].mileage + man[1].mileage + man[2].mileage) + "입니다.");
		System.out.println("총 마일리지의 평균은 " + ((man[0].mileage + man[1].mileage + man[2].mileage) / 3) + "입니다.");
	}

}
