package window;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Test7 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		f.getContentPane().setLayout(null);
		
		String result = "컴퓨터 승리";
		
		JButton button = new JButton("가위");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}//가위
		});
		button.setFont(new Font("굴림", Font.BOLD, 15));
		button.setBounds(12, 86, 97, 58);
		f.getContentPane().add(button);
		
		JButton button1 = new JButton("바위");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}//바위
		});
		button1.setFont(new Font("굴림", Font.BOLD, 15));
		button1.setBounds(143, 86, 97, 58);
		f.getContentPane().add(button1);
		
		JButton button2 = new JButton("보");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}//보
		});
		button2.setFont(new Font("굴림", Font.BOLD, 15));
		button2.setBounds(275, 86, 97, 58);
		f.getContentPane().add(button2);
		
		JLabel label = new JLabel("원하는 것을 내세요!");
		label.setFont(new Font("굴림", Font.BOLD, 25));
		label.setBounds(80, 25, 235, 46);
		f.getContentPane().add(label);
		
		JLabel label2 = new JLabel("        승자는?");
		label2.setFont(new Font("굴림", Font.BOLD, 25));
		label2.setBounds(80, 198, 235, 75);
		f.getContentPane().add(label2);
		
		
		Random random = new Random();
		JOptionPane.showMessageDialog(null, "컴퓨터가 이겼습니다!");
		
		f.setVisible(true);
	}
}

