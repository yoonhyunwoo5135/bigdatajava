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

public class Main {
	private static JTable table1;
	private static JTable table2;
	private static JTable table3;
	
	public static void main(String[] args) {
		Main main = new Main();
		
		String a = "�Ƹ޸�ī��";
		String b = "4000��";
		String result = a + " " + b;
		
		JFrame f1 = new JFrame("ī�� ���� �ý���");
		f1.setSize(1080, 800);
		f1.getContentPane().setLayout(null);
		
		table1 = new JTable();
		table1.setCellSelectionEnabled(true);
		table1.setBackground(Color.DARK_GRAY);
		table1.setBounds(27, 98, 603, 354);
		f1.getContentPane().add(table1);
		
		table2 = new JTable();
		table2.setBackground(Color.ORANGE);
		table2.setBounds(27, 98, 603, 354);
		f1.getContentPane().add(table2);
		
		table3 = new JTable();
		table3.setBackground(Color.GREEN);
		table3.setBounds(27, 98, 603, 354);
		f1.getContentPane().add(table3);
		
		JButton b1 = new JButton("\uACB0\uC81C");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				table1.setVisible(true);
				table2.setVisible(false);
				table3.setVisible(false);
			}//����
		});
		b1.setFont(new Font("����", Font.BOLD, 26));
		b1.setBounds(27, 25, 129, 50);
		f1.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uBA64\uBC84\uC27D");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table1.setVisible(false);
				table2.setVisible(true);
				table3.setVisible(false);
			}//�����
		});
		b2.setFont(new Font("����", Font.BOLD, 26));
		b2.setBounds(192, 25, 129, 50);
		f1.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC7AC\uACE0");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table1.setVisible(false);
				table2.setVisible(false);
				table3.setVisible(true);
			}//���
		});
		b3.setFont(new Font("����", Font.BOLD, 26));
		b3.setBounds(355, 25, 129, 50);
		f1.getContentPane().add(b3);
		
		JButton b4 = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel la1 = new JLabel(result);
				la1.setBounds(37, 462, 224, 33);
				f1.getContentPane().add(la1);
				f1.setVisible(true);
			}
		});
		b4.setFont(new Font("����", Font.BOLD, 26));
		b4.setBounds(642, 98, 171, 50);
		f1.getContentPane().add(b4);
		
		
		
		f1.setVisible(true);
	}
}
