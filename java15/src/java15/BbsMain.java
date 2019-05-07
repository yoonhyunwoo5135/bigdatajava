package java15;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsMain {
	private JTextField textId;
	private JTextField textContent;
	private JTextField textTitle;
	private JTextField textEtc;
	
	public BbsMain(){
		JFrame f = new JFrame();
		f.setSize(400, 600);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel la1 = new JLabel("<\uC544\uC774\uB514>");
		la1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(la1);
		
		textId = new JTextField();
		textId.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(textId);
		textId.setColumns(10);
		
		JLabel la2 = new JLabel("<\uD0C0\uC774\uD2C0>");
		la2.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(la2);
		
		textTitle = new JTextField();
		textTitle.setFont(new Font("±¼¸²", Font.BOLD, 30));
		textTitle.setColumns(10);
		f.getContentPane().add(textTitle);
		
		JLabel la3 = new JLabel("<\uB0B4\uC6A9>");
		la3.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(la3);
		
		textContent = new JTextField();
		textContent.setFont(new Font("±¼¸²", Font.BOLD, 30));
		textContent.setColumns(10);
		f.getContentPane().add(textContent);
		
		JLabel la4 = new JLabel("<\uAE30\uD0C0>");
		la4.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(la4);
		
		textEtc = new JTextField();
		textEtc.setFont(new Font("±¼¸²", Font.BOLD, 30));
		textEtc.setColumns(10);
		f.getContentPane().add(textEtc);
		
		JButton b1 = new JButton("BBS\uAC80\uC0C9");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputId = textId.getText();
				BbsDao dao = new BbsDao();
				BbsDto dto = dao.select(inputId);
				
				String id = dto.getId();
				String title = dto.getTitle();
				String content = dto.getContent();
				String etc = dto.getEtc();
				
				textId.setText(id);
				textTitle.setText(title);
				textContent.setText(content);
				textEtc.setText(etc);
			}
		});
		b1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("BBS\uC785\uB825");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BbsDto dto = new BbsDto();
				dto.setId(textId.getText());
				dto.setId(textTitle.getText());
				dto.setId(textContent.getText());
				dto.setId(textEtc.getText());				
				
				BbsDao dao = new BbsDao();
				
				dto = dao.insert(dto);
				
			}
		});
		b2.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("BBS\uC0AD\uC81C");
		b3.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("BBS\uC218\uC815");
		b4.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(b4);
		
		
		
		
		f.setVisible(true);
	}
		
	public static void main(String[] args) {
		BbsMain name = new BbsMain();
		
		
		
		
	}

}
