package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트4 {

	public static void main(String[] args) {
		String me = JOptionPane.showInputDialog("나의 나이를 입력하세요");
		String bro = JOptionPane.showInputDialog("동생의 나이를 입력하세요");
		
		int meage = Integer.parseInt(me);
		int broage = Integer.parseInt(bro);
		
		if(meage >= broage) {
			System.out.println("내가 떡 2개를 먹어요");
			
		}
		else {
			System.out.println("동생이 떡 2개를 먹어요");
			
		}
		
		
	}

}
