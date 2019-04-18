package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트3 {

	public static void main(String[] args) {
		String chicken = JOptionPane.showInputDialog("오늘의 치킨 가격은 얼마 인가요?");
		int price = Integer.parseInt(chicken);
		if(price > 9000) {
			System.out.println("내일 다시 전화할게요");			
		}
		else {
			System.out.println("주문할게요");
		}
		
	}

}
