package java25;

public class CircleClass implements Circle {

	@Override
	public void size() {
		System.out.println("원의 지름을 구하다");
	}

	@Override
	public void calculate_r() {
		System.out.println("원의 반지름을 구하다");
	}

}
