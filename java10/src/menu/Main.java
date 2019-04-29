package menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private static JTextField textField;
	private static JTextField textField_1;

	public static int num = 0;
	public static int sum = 0;

	public static void main(String[] args) {

		ZZamppong zp = new ZZamppong();
		Udong ud = new Udong();
		Jajang jj = new Jajang();

		JFrame f = new JFrame("주문하세요.");
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);

		JLabel la3 = new JLabel();
		ImageIcon img = new ImageIcon("main.jpg");
		la3.setBounds(0, 67, 584, 494);
		f.getContentPane().add(la3);
		la3.setIcon(new ImageIcon("main.jpg"));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 102, 255));
		panel.setBounds(0, 0, 584, 67);
		f.getContentPane().add(panel);
		panel.setLayout(null);

		JButton b1 = new JButton("짬뽕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(++num));
				sum = zp.price * num;
				textField_1.setText(String.valueOf(sum));
				ImageIcon zp2 = new ImageIcon("jjamppong.jpg");
				la3.setIcon(zp2);
			}
		});
		b1.setBounds(30, 10, 80, 40);
		panel.add(b1);
		b1.setFont(new Font("굴림", Font.BOLD, 16));

		JButton b2 = new JButton("우동");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(++num));
				sum = ud.price * num;
				textField_1.setText(String.valueOf(sum));
				ImageIcon ud2 = new ImageIcon("udong.jpg");
				la3.setIcon(ud2);
			}// 우동
		});
		b2.setFont(new Font("굴림", Font.BOLD, 16));
		b2.setBounds(122, 10, 80, 40);
		panel.add(b2);

		JButton b3 = new JButton("짜장");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(++num));
				sum = jj.price * num;
				textField_1.setText(String.valueOf(sum));
				ImageIcon jj2 = new ImageIcon("jajang.jpg");
				la3.setIcon(jj2);
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 16));
		b3.setBounds(214, 10, 80, 40);
		panel.add(b3);

		JLabel la1 = new JLabel("개수");
		la1.setBounds(306, 10, 40, 40);
		panel.add(la1);
		la1.setFont(new Font("굴림", Font.BOLD, 16));

		textField = new JTextField();
		textField.setText(String.valueOf(num));
		textField.setBounds(345, 17, 60, 30);
		panel.add(textField);
		textField.setColumns(10);

		JLabel la2 = new JLabel("금액");
		la2.setFont(new Font("굴림", Font.BOLD, 16));
		la2.setBounds(417, 10, 40, 40);
		panel.add(la2);

		textField_1 = new JTextField();
		textField_1.setText(String.valueOf(sum));
		textField_1.setColumns(10);
		textField_1.setBounds(460, 17, 110, 30);
		panel.add(textField_1);

		f.setVisible(true);

	}// main end
}// class end
