package pos;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.List;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Choice;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		
		String a = "아메리카노";
		String b = "4000원";
		String result = a + " " + b;
		
		JFrame f1 = new JFrame("카페 포스 시스템");
		f1.setSize(1080, 800);
		f1.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("\uACB0\uC81C");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}//결제
		});
		b1.setFont(new Font("굴림", Font.BOLD, 26));
		b1.setBounds(27, 25, 129, 50);
		f1.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uBA64\uBC84\uC27D");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}//멤버쉽
		});
		b2.setFont(new Font("굴림", Font.BOLD, 26));
		b2.setBounds(192, 25, 129, 50);
		f1.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC7AC\uACE0");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}//재고
		});
		b3.setFont(new Font("굴림", Font.BOLD, 26));
		b3.setBounds(355, 25, 129, 50);
		f1.getContentPane().add(b3);
		
		JButton b4 = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel la1 = new JLabel(result);
				la1.setBounds(37, 462, 224, 33);
				f1.getContentPane().add(la1);
				la1.setVisible(true);
			}
		});
		b4.setFont(new Font("굴림", Font.BOLD, 26));
		b4.setBounds(642, 98, 171, 50);
		f1.getContentPane().add(b4);
		
		
		
		
		f1.setVisible(true);
	}
}
