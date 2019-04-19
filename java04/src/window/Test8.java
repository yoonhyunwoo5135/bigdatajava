package window;

import java.awt.FlowLayout;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Test8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("가위, 바위, 보");
		System.out.println("원하는 것을 내세요:");
		
		while(true){
		
			System.out.println("------------");
			int me =  sc.nextInt();
			int a = random.nextInt(3);
			System.out.print(a);
			
			if(a == 0 && me ==2) {
				System.out.println("졌습니다.");
			}
			else if(a > me) {
				System.out.println("졌습니다..");
			}
			else if(a == me) {
				System.out.println("비겼습니다.");
			}
			else if(a < me){
				System.out.println("이겼습니다..");
			}
			else {
				System.out.println("가위(0), 바위(1), 보(2) 중에 내주십시오.");
			}
		}
	}
}

