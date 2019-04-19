package window;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	private static JTextField n2;
	private static JTextField n1;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();

		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel label = new JLabel("<<<나의 계산기>>>");
		label.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(label);

		JLabel Label2 = new JLabel("숫자1>>");
		Label2.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(Label2);

		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(n1);
		n1.setColumns(10);

		JLabel Label3 = new JLabel("숫자2>>");
		Label3.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(Label3);

		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(n2);
		n2.setColumns(10);

		JButton Button = new JButton("두 수를 더하기");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();

				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);

				System.out.println(number1 + number2);
			}
		});
		Button.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(Button);

		JButton Button2 = new JButton("두 수를 빼기   ");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();

				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);

				System.out.println(number1 - number2);

			}
		});
		Button2.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(Button2);

		JButton Button3 = new JButton("두 수를 곱하기");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();

				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);

				System.out.println(number1 * number2);
			}
		});
		Button3.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(Button3);

		JButton Button4 = new JButton(" 두 수를 나누기");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();

				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);

				System.out.println(number1 / number2);
			}
		});
		Button4.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(Button4);

		f.setVisible(true);

	}

}
