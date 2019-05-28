package java22;

public class ForTest3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("스레드3------");
		}
		
	}

}
