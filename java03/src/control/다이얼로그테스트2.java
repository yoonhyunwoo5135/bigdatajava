package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트2 {

	public static void main(String[] args) {
		System.out.println("자동차 성능 테스트를 해보세요");
		System.out.println("점수는 100점 만점");
		
		String speed = JOptionPane.showInputDialog("속도의 평점은? ");
		String safety = JOptionPane.showInputDialog("안정성의 평점은? ");
		String efficiency = JOptionPane.showInputDialog("연비의 평점은? ");
		
		int speed2 = Integer.parseInt(speed);
		int safety2 = Integer.parseInt(safety);
		int efficiency2 = Integer.parseInt(efficiency);
		
		double result = speed2 * 0.5; 
		double result2 = safety2 * 0.3;
		double result3 = efficiency2 * 0.2;
		double result4 = result + result2 + result3;
		
		
		if(result4 >= 80) {
			System.out.println(result4 + "점 우수입니다.");
		}
		else if(result4 >= 70) {
			System.out.println(result4 + "점 보통입니다.");
		}
		else {
			System.out.println(result4 + "점 불량입니다.");
		}
		if(speed2 >= 80) {
				if(safety2 >= 80) {
					if(efficiency2 >= 80) {
						System.out.println("best!");
						
					}
					
				}
			
		}
		
	}

}
