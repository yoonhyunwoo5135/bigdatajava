
package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame implements ActionListener{
	JButton b;
	JButton b2;
	JButton b3;
	public Test() {
		setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b = new JButton("1번");
		b2 = new JButton("2번");
		b3 = new JButton("3번");
		add(b);
		add(b2);
		add(b3);
		
//		ActionProcess action = new ActionProcess();
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Test my = new Test();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.out.println("1번을 누르셨군요.");
		}
		else if(e.getSource() == b2) {
			System.out.println("2번을 누르셨군요.");
		}
		else if(e.getSource() == b3) {
			System.out.println("3번을 누르셨군요.");
		}
		
	}

}
