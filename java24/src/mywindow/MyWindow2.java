
package mywindow;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame implements ActionListener{
	JButton b;
	JButton b2;

	public MyWindow2() {
		setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");
		add(b);
		add(b2);
		
//		ActionProcess action = new ActionProcess();
		b.addActionListener(this);
		b2.addActionListener(this);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyWindow2 my = new MyWindow2();
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
