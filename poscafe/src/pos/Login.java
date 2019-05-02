package pos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		JFrame f = new JFrame("카페 포스 시스템");
		f.setBackground(new Color(192, 192, 192));
		f.getContentPane().setBackground(new Color(0, 153, 255));
		f.setSize(1080, 800);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(480, 399, 302, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(480, 472, 302, 38);
		f.getContentPane().add(t2);
		
		JLabel la1 = new JLabel("\uC544\uC774\uB514");
		la1.setFont(new Font("굴림", Font.BOLD, 26));
		la1.setBounds(332, 399, 110, 38);
		f.getContentPane().add(la1);
		
		JLabel la2 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		la2.setFont(new Font("굴림", Font.BOLD, 26));
		la2.setBounds(332, 472, 110, 38);
		f.getContentPane().add(la2);
		
		JLabel la3 = new JLabel("\uCE74\uD398 POS \uC2DC\uC2A4\uD15C");
		la3.setFont(new Font("굴림", Font.BOLD, 90));
		la3.setBounds(174, 168, 765, 180);
		f.getContentPane().add(la3);
		
		JButton b2 = new JButton("\uC885\uB8CC\uD558\uAE30");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까?");
				if (confirm == 0) {
					System.exit(0);
				}
				
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 24));
		b2.setBounds(593, 551, 153, 37);
		f.getContentPane().add(b2);
		
		JButton b1 = new JButton("\uB85C\uADF8\uC778");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = "manager";
				String pw = "abc1234";
				
				String id2 = t1.getText();
				String pw2 = t2.getText();
				if(id.equals(id2) && pw.equals(pw2)) {
					Main main = new Main();
					f.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "다시 입력해주세요");
				}
			}//로그인
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 24));
		b1.setBounds(421, 551, 134, 37);
		f.getContentPane().add(b1);
		
		f.setVisible(true);
		
		
		
		
	}
}
