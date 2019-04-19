package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class MyWindow2 {

	public static void main(String[] args) {
		// 프레임
		JFrame f = new JFrame("입력 값 받는 프로그램.");
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		JTextField text = new JTextField(20);
		JButton button = new JButton("나를 눌러요.");
		button.setBackground(UIManager.getColor("Button.focus"));
		button.setForeground(Color.BLACK);
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
		label.setBackground(Color.WHITE);
		label.setFont(new Font("굴림", Font.BOLD, 15));
		label.setForeground(Color.BLUE);
		// 물 흐르듯이 배치
		// 입력 받는 화면(한줄 짜리)
		// 버튼
		// 글자들
		
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌러졌군요..!!");
				text.getText();
				String data = text.getText();
				System.out.println("당신의 주요 과목은" + data + "입니다.");
			}
		});
		
		
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(label);
		f.getContentPane().add(text);
		f.getContentPane().add(button);
		f.setVisible(true);
	}

}
