package car;

public class MelonCar implements Car {
	
	public void start() {
		System.out.println("차가 출발을 함");
	}
	public void speedUp() {
		System.out.println("속도를 가속");
	}
	public void speedDown() {
		System.out.println("속도를 감속");
	}
	
}
