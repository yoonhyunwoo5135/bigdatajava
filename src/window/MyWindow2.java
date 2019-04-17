package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow2 {

	public static void main(String[] args) {
		//1. 프레임 만들기(300x300)
		//2. 자바 프로젝트 버튼을 만들어서
		//3. 누르면, "다음주부터 자바 프로젝트가 시작 됩니다."
		
		JFrame f = new JFrame();
		
		f.setSize(300, 300);
		f.setTitle("자바 프로젝트 시작");
		JButton b1 = new JButton("자바 프로젝트");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("다음주 부터 자바프로젝트가 시작됩니다.");
				
				
			}
		});
		
		f.getContentPane().add(b1);
 		f.setVisible(true);
		
		
	}

}
