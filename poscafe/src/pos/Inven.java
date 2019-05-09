package pos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;
import java.awt.ScrollPane;

import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;

public class Inven {
	
	private JTable table;
	static JTextField t1;
	
	
	public Inven() {
		JFrame f = new JFrame("Ä«Æä Æ÷½º ½Ã½ºÅÛ");
		f.setSize(800 , 600);
		f.setResizable(false);
		
		InvenDao dao = new InvenDao();
		InvenDto dto = dao.list();
				
		ImageIcon icon = new ImageIcon("Mainpont.png");
		JLabel la1 = new JLabel(icon);
		la1.setBounds(37, 8, 300, 80);
		f.getContentPane().add(la1);
		
		String [] header = {"¿øµÎ", "¿ìÀ¯", "ÃÊÄÝ¸´", "Å©¸²", "ÄÅ", "»¡´ë"};
		Object[][] contents = {
				{dto.getBean(), dto.getMilk(), dto.getChoco() ,dto.getCream(), dto.getCup(), dto.getStraw()}
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 98, 720, 143);
		f.getContentPane().add(scrollPane);
		
		table = new JTable(contents, header);
		table.setRowSelectionAllowed(false);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		
		JButton addbean = new JButton("\uC6D0\uB450\uC8FC\uBB38");
		addbean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDao dao = new AddDao();
				AddDto dto = dao.Addbean();
				
				int confirm = JOptionPane.showConfirmDialog(null, "ÁÖ¹®ÇÏ½Ã°Ú½À´Ï±î?");
				if(confirm == 0) {
					dto.getBean();
					
				}
				
				
			}
		});
		addbean.setFont(new Font("±¼¸²", Font.BOLD, 20));
		addbean.setBounds(37, 276, 142, 47);
		f.getContentPane().add(addbean);
		
		JButton addmilk = new JButton("\uC6B0\uC720\uC8FC\uBB38");
		addmilk.setFont(new Font("±¼¸²", Font.BOLD, 20));
		addmilk.setBounds(37, 350, 142, 47);
		f.getContentPane().add(addmilk);
		
		JButton addchoco = new JButton("\uCD08\uCF5C\uB9BF\uC8FC\uBB38");
		addchoco.setFont(new Font("±¼¸²", Font.BOLD, 20));
		addchoco.setBounds(37, 427, 142, 47);
		f.getContentPane().add(addchoco);
		
		JButton addcream = new JButton("\uD06C\uB9BC\uC8FC\uBB38");
		addcream.setFont(new Font("±¼¸²", Font.BOLD, 20));
		addcream.setBounds(206, 276, 142, 47);
		f.getContentPane().add(addcream);
		
		JButton addcup = new JButton("\uCEF5\uC8FC\uBB38");
		addcup.setFont(new Font("±¼¸²", Font.BOLD, 20));
		addcup.setBounds(206, 350, 142, 47);
		f.getContentPane().add(addcup);
		
		JButton addstraw = new JButton("\uBE68\uB300\uC8FC\uBB38");
		addstraw.setFont(new Font("±¼¸²", Font.BOLD, 20));
		addstraw.setBounds(206, 427, 142, 47);
		f.getContentPane().add(addstraw);
		
		
		t1 = new JTextField();
		t1.setBounds(534, 281, 223, 42);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel la2 = new JLabel("\uC8FC\uBB38 \uC218\uB7C9");
		la2.setFont(new Font("±¼¸²", Font.BOLD, 20));
		la2.setBounds(411, 279, 97, 40);
		f.getContentPane().add(la2);
		f.getContentPane().setLayout(null);
		
		
		f.setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		Inven inven = new Inven();
	
	}
}
