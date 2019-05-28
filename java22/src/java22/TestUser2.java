package java22;

public class TestUser2 {

	public static void main(String[] args) {
		Test3 t1 = new Test3();//스레드 객체 생성
		Test4 t2 = new Test4();
		Test5 t3 = new Test5();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
