package array;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 버튼들....200개");
		f.setSize(1280, 720);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(null);//배치 부품들 안쓰겠다 라는 의미
		//버튼 들어갈 자리 100개 만들어 둠.
		JButton [] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("나는 버튼 " + i);
		}
		
		Random random = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = random.nextInt(1280);
			int y = random.nextInt(720);
			buttons[i].setBounds(x, y, 150, 20);
			f.add(buttons[i]);
		}
		
		System.out.println(buttons[4].getText());
		
		f.setVisible(true);
	}

}
