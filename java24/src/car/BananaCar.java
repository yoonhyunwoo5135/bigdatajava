package car;

public class BananaCar implements Car {
	
	public void start() {
		System.out.println("차가 출발");
	}
	public void speedUp() {
		System.out.println("속도를 올림");
	}
	public void speedDown() {
		System.out.println("속도를 낮춤");
	}
	
}
