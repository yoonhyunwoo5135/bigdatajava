package java17;

public class SuperMan extends Man {
	//���� �Ӽ�
	boolean fly;
	
	//���� �Ӽ�
	public void flySpeed() {
		System.out.println("500���� ����.");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + "]";
	}
	
	
}
