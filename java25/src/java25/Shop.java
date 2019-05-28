package java25;

public class Shop implements Circle, Pay {

	@Override
	public void size() {
		System.out.println("크다아아아아");
	}

	@Override
	public void calculate() {
		System.out.println("크기가 얼마나 되니");
	}

	@Override
	public void calculate_r() {
		System.out.println("반지름은 얼마뉘");
	}

}
