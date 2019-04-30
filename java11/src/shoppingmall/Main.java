package shoppingmall;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Member[] cup = new Member[3];

		for (int i = 0; i < 3; i++) {
			String name = JOptionPane.showInputDialog("이름을 입력하세요");
			String age2 = JOptionPane.showInputDialog("나이를 입력하세요");
			int age = Integer.parseInt(age2);
			String phone = JOptionPane.showInputDialog("연락처를 입력하세요");
			String adress = JOptionPane.showInputDialog("주소를 입력하세요");
			cup[i] = new Member(name, age, phone, adress);
			
		}
		
		System.out.println("쇼핑몰 회원가입 명단입니다.");
		System.out.println("============================");
		System.out.println("이름" + "\t" + "나이" + "\t" + "연락처" + "\t" + "주소");
		System.out.println("----------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(cup[i]);
		}
		
		
		
	}

}
