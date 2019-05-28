package game;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {
	private JLabel label1, label2;

	public Game() {
		setTitle("이미지");
		setSize(800, 600);
		getContentPane().setLayout(null);

		label1 = new JLabel("");
		label1.setFont(new Font("굴림", Font.BOLD, 60));
		label1.setBounds(30, 10, 742, 111);
		getContentPane().add(label1);

		label2 = new JLabel("");
		label2.setBounds(206, 100, 300, 450);
		getContentPane().add(label2);

		String name = "박보검";
		(new GameThread()).start();
		(new GameThread2()).start();
		setVisible(true);

	}

	public class GameThread extends Thread {

		@Override
		public void run() {

			for (int i = 500; i >= 0; i--) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label1.setText("박보검의 게임 시작 : " + i + "");
			}

		}

	}

	class GameThread2 extends Thread {

		public void run() {
			String[] imgs = { "1.jpg", "2.jpg", "3.jpg" };

			for (int i = 0; i < imgs.length; i++) {
				try {
					Thread.sleep(1000);
					ImageIcon icon = new ImageIcon(imgs[i]);
					label2.setIcon(icon);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
	}
}
