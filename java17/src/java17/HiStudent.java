package java17;

public class HiStudent extends Student{
	
	int weight;
	
	public void scare() {
		System.out.println("������ Ī����");
	}

	@Override
	public String toString() {
		return "HiStudent [weight=" + weight + "]";
	}
	
}
