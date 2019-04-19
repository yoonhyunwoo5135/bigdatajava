package window;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 나의두번째계산기2 {
	private static JTextField n3;
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 두번째 계산기");
		f.setSize(400, 300);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("숫자1");
		label.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(label);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 30));
		n1.setColumns(10);
		f.getContentPane().add(n1);
		
		JLabel label2 = new JLabel("숫자2");
		label2.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(label2);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 30));
		n2.setColumns(10);
		f.getContentPane().add(n2);
		
		JLabel label3 = new JLabel("연산자");
		label3.setFont(new Font("굴림", Font.BOLD, 34));
		f.getContentPane().add(label3);
		
		n3 = new JTextField();
		n3.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(n3);
		n3.setColumns(10);
		
		JButton button = new JButton("계산");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				String num3 = n3.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				int imsi = 0;
				switch(num3) {
				case "+": imsi = number1 + number2; break;
				case "-": imsi = number1 - number2; break;
				case "*": imsi = number1 * number2; break;
				case "/": imsi = number1 / number2; break;//반드시 브레이크를 걸어야 함
				default: System.out.println("연산할 수 없는 기호입니다.");
				}

			}
		});
			
		
		
		button.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(button);
		
		
		f.setVisible(true);
	}

}
