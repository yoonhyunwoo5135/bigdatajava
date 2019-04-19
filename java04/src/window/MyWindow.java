package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class MyWindow {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("");
		f.setSize(300, 300);
		JLabel label = new JLabel("당신이 사용하는 프로그램 언어를 입력하세요.");
		JLabel label2 = new JLabel("당신이 사용하는 개발 툴을 입력하세요.");
		JTextField text = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JButton button = new JButton("나를 눌러요.");
		FlowLayout flow = new FlowLayout();
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("나를 눌러 줬군요.");
				String data = text.getText();
				System.out.println("당신의 주요 과목은" + data + " 입니다.");
					
			}
		});
		
		
		
		
		
		JButton Button2 = new JButton("나도 눌러요.");
		Button2.setFont(new Font("굴림", Font.PLAIN, 13));
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나를 눌러 줬군요.");
				String data2 = text2.getText();
				System.out.println("당신의 주요 툴은 " + data2 + "입니다.");
			
			
			}
		});
		
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(label);
		f.getContentPane().add(text);
		f.getContentPane().add(label2);
		f.getContentPane().add(text2);
		f.getContentPane().add(button);
		f.getContentPane().add(Button2);
				
		f.setVisible(true);
		
		
	}

}
