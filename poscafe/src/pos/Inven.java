package pos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class Inven {
	
	private JTable table;
	
	
	public Inven() {
		JFrame f = new JFrame("카페 포스 시스템");
		f.setSize(1080 , 800);
		f.setResizable(false);
		JButton b1 = new JButton("\uB3CC\uC544\uAC00\uAE30");
		b1.setBounds(764, 683, 107, 33);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main1 main = new Main1();
				f.setVisible(false);
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		BbsDao3 dao = new BbsDao3();
		ArrayList list = dao.selectAll();
				
		String [] header = {"원두", "우유", "초콜릿", "크림", "컵", "빨대"};
		String [][] contents = {
				{list.add(dao)}
				};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 142, 761, 144);
		f.getContentPane().add(scrollPane);
		
		table = new JTable(contents, header);
		scrollPane.setViewportView(table);
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		Inven inven = new Inven();
	
	}
}
