package cal;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Calculate {
	private JTable table;
	static DefaultTableModel tmodel;
	private CalDto dto;
	
	public Calculate() {
		CalDao dao = new CalDao();
		dto = dao.count();
		CalDao dao2 = new CalDao();
		CalDto dto2 = dao2.list();
		
		JFrame f = new JFrame();
		f.setSize(1080, 800);
		f.setBounds(400, 200, 1080, 800);
		f.getContentPane().setLayout(null);
		
		String [] header = {"결제번호", "메뉴명", "가격", "쿠폰여부", "성별", "날짜"};
		Object[][] contents = new Object[dto.getCount()][6];
		for (int i = 0; i < contents.length; i++) {
			for (int j = 0; j < contents[i].length;) {				
				contents[i][j] = dto2.getPin();
				contents[i][j+1] = dto2.getMenu();
				contents[i][j+2] = dto2.getPrice();
				contents[i][j+3] = dto2.getCuppon();
				contents[i][j+4] = dto2.getJender();
				contents[i][j+5] = dto2.getDate();
			}
		}
		System.out.println(dto.getCount());
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 109, 679, 483);
		f.getContentPane().add(scrollPane);
		
		tmodel = new DefaultTableModel(header, 0);
		table = new JTable(tmodel);
		for (int j = 0; j < contents.length; j++) {
			tmodel.addRow(contents[j]);			
		}
		table.setRowSelectionAllowed(false);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		
		
		
		
		
		f.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		Calculate cal = new Calculate();
	}
}
