package diary;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;
	
	public Diary() {
		
		JFrame f = new JFrame();
		f.setSize(600, 700);
		f.getContentPane().setLayout(null);
		
		JLabel la1 = new JLabel("일기 작성 날짜");
		la1.setFont(new Font("굴림", Font.BOLD, 16));
		la1.setBounds(26, 10, 130, 35);
		f.getContentPane().add(la1);
		
		JLabel la2 = new JLabel("일기 작성 제목");
		la2.setFont(new Font("굴림", Font.BOLD, 16));
		la2.setBounds(26, 55, 130, 35);
		f.getContentPane().add(la2);
		JLabel la3 = new JLabel("일기 작성 내용");
		la3.setFont(new Font("굴림", Font.BOLD, 16));
		la3.setBounds(224, 101, 149, 35);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(199, 11, 258, 35);
		f.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(199, 56, 258, 35);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setBounds(32, 146, 525, 367);
		f.getContentPane().add(t3);
		
		f.getContentPane().add(la3);
		
		JButton b1 = new JButton("파일에 저장하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter w = new FileWriter(t1.getText());
					w.write(t2.getText() + "\n");
					w.write(t3.getText() + "\n");
					w.close();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}//파일에 저장하기
		});
		b1.setFont(new Font("굴림", Font.BOLD, 18));
		b1.setBounds(159, 534, 265, 35);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("파일에서 읽어오기");
		b2.setFont(new Font("굴림", Font.BOLD, 18));
		b2.setBounds(159, 579, 265, 35);
		f.getContentPane().add(b2);
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Diary dia = new Diary();
		
	}
}
