package window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기2 {
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame f = new JFrame("계산기");
		f.setSize(500, 500);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JLabel label = new JLabel("숫자 1 : 200");
		label.setFont(new Font("굴림", Font.BOLD, 40));
		JLabel label2 = new JLabel("숫자 2 : 100");
		label2.setFont(new Font("굴림", Font.BOLD, 40));
		
		JButton button = new JButton("<<<<계산>>>>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 40));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.getContentPane().add(label);
		f.getContentPane().add(label2);
		
		JLabel Label2 = new JLabel("연산자: ");
		Label2.setBackground(Color.BLACK);
		Label2.setFont(new Font("굴림", Font.BOLD, 60));
		f.getContentPane().add(Label2);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 36));
		f.getContentPane().add(textField);
		textField.setColumns(10);
		f.getContentPane().add(button);

		
		
		f.setVisible(true);
		
	}

}
