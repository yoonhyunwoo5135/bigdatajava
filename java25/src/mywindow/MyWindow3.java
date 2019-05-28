
package mywindow;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame implements ActionListener{
	JButton b;
	JButton b2;

	public MyWindow3() {
		setSize(300, 300);
		b = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");
		add(b);
		add(b2);
		setLayout(new FlowLayout());
		
		ActionListener action = new ActionListener() {//객체를 생성한 것이 아니라 익명 클래스를 만들어서 가져온 것
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀군요..");
			}
		};
		
		b.addActionListener(action);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 버튼을 누르셨군요..");
			}
		});
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyWindow3 my = new MyWindow3();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.out.println("나를 눌러요.를 누르셨군요.");
		}
		else if(e.getSource() == b2) {
			System.out.println("나도 눌러요.를 누르셨군요.");
		}
		
	}

}
