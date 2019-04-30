
package diary;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("로그인 화면");
		f.setSize(600, 700);
		f.getContentPane().setLayout(null);
		
		JLabel La1 = new JLabel("");
		La1.setBounds(0, 0, 584, 481);
		f.getContentPane().add(La1);
		ImageIcon icon = new ImageIcon("jjamppong.jpg");
		La1.setIcon(new ImageIcon("jjamppong.jpg"));
		
		JLabel La2 = new JLabel("ID");
		La2.setBackground(Color.LIGHT_GRAY);
		La2.setFont(new Font("굴림", Font.BOLD, 18));
		La2.setBounds(39, 535, 24, 24);
		f.getContentPane().add(La2);
		
		JLabel LA3 = new JLabel("PW");
		LA3.setFont(new Font("굴림", Font.BOLD, 18));
		LA3.setBackground(Color.LIGHT_GRAY);
		LA3.setBounds(289, 535, 38, 24);
		f.getContentPane().add(LA3);
		
		t1 = new JTextField();
		t1.setBounds(75, 539, 175, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(335, 539, 194, 21);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton b1 = new JButton("로그인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = t1.getText();
				String pw = t2.getText();
				
				String id2 = "hi"; 
				String pw2 = "1234";
				if(id.equals(id2) && pw.equals(pw2)) {
					Diary dia = new Diary();					
				}
				else {
					JOptionPane.showMessageDialog(null , "다시 입력해주세요");
				}
				
			}
		});
		b1.setBounds(230, 594, 97, 23);
		f.getContentPane().add(b1);
		f.setVisible(true);
		
		
		
	}
}
