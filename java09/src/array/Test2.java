package array;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test2 {

	public static void main(String[] args) {
		String [] image = {"j1.png", "j2.png" , "m1.PNG", "m2.PNG"};
		
		JFrame f = new JFrame("핳하하하하하핳");
		FlowLayout flow = new FlowLayout();
		f.setSize(300, 800);
		f.getContentPane().setLayout(flow);
		ImageIcon icon = new ImageIcon("j1.png");
		JButton img = new JButton();
		img.setIcon(new ImageIcon("j1.png"));
		f.getContentPane().add(img);
		
		
		JButton b1 = new JButton("왼쪽으로");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				i--;
				ImageIcon icon = new ImageIcon(image[i]);
				img.setIcon(icon);				
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("오른쪽으로");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				i++;
				if(i >= 3) {
					ImageIcon icon = new ImageIcon(image[0]);
					img.setIcon(icon);									
				}
				else if(i > 0 && i < 3) {
					ImageIcon icon = new ImageIcon(image[i]);
					img.setIcon(icon);									
				}
			}
		});
		
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(b2);
		f.setVisible(true);
		
	}

}
