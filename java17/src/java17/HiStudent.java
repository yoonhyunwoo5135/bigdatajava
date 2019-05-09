package java17;

public class HiStudent extends Student{
	
	int weight;
	
	public void scare() {
		System.out.println("무서운 칭구들");
	}

	@Override
	public String toString() {
		return "HiStudent [weight=" + weight + "]";
	}
	
}
