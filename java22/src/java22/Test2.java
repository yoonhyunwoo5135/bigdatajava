package java22;

public class Test2 extends Thread {
	@Override
	public void run() {
		
		for (int i = 100; i > 0; i--) {
			System.out.println("감소: " + i);
		}
		
	}
	
	
}
