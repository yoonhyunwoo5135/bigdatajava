package java22;

public class TestUser {

	public static void main(String[] args) {
		Test1 t1 = new Test1();//스레드 객체 생성
		Test2 t2 = new Test2();
		
		
		t1.start();
		t2.start();

		
	}

}
