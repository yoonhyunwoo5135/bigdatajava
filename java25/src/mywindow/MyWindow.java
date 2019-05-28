
package mywindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements ActionListener{

	public MyWindow() {
		setSize(300, 300);
		JButton b = new JButton("나를 눌러요.");
		add(b);
//		ActionProcess action = new ActionProcess();
		b.addActionListener(this);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyWindow my = new MyWindow();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}

}
