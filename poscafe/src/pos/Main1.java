package pos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JScrollPane;

public class Main1 {
	private JTable table;
	
	public Main1() {
		String a = "아메리카노";
		String b = "4000원";
		String result = a + " " + b;
		
		JFrame f = new JFrame("카페 포스 시스템");
		f.setSize(1080, 800);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("\uACB0\uC81C");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Paybill pay = new Paybill();
				f.setVisible(false);			
			}//결제
		});
		b1.setFont(new Font("굴림", Font.BOLD, 26));
		b1.setBounds(754, 384, 129, 50);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uBA64\uBC84\uC27D");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Membership mem = new Membership();
				f.setVisible(false);
			}//멤버쉽
		});
		b2.setFont(new Font("굴림", Font.BOLD, 26));
		b2.setBounds(906, 384, 129, 50);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC7AC\uACE0");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inven inven = new Inven();
				f.setVisible(false);
			}//재고
		});
		b3.setFont(new Font("굴림", Font.BOLD, 26));
		b3.setBounds(906, 457, 129, 50);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("\uBA54\uB274");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel la1 = new JLabel(result);
				la1.setBounds(37, 462, 224, 33);
				f.getContentPane().add(la1);
				la1.setVisible(true);
			}
		});
		b4.setFont(new Font("굴림", Font.BOLD, 26));
		b4.setBounds(22, 10, 171, 50);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("\uB85C\uADF8\uC778 \uD654\uBA74\uC73C\uB85C");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "로그인 화면으로 가시겠습니까?");
				if (confirm == 0) {
					Login log = new Login();
				}
			}//로그인 화면으로
		});
		b5.setBounds(906, 704, 129, 34);
		f.getContentPane().add(b5);
		
		
		f.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		Main1 main = new Main1();
		
	}
}
