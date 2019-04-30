package 생성자;


public class Car {
	//정적 속성
	String color;
	boolean convertible;
	
	
	//단축키: Alt + Shift + s + o
	public Car() {
		
	}

	public Car(String color, boolean convertible) {
		this.color = color;
		this.convertible = convertible;
	}

	//동적 속성
	public void change() {
		System.out.println("기어를 바꾸다");
	}
	
	public int speedUp(int nowSpeed) {
		return nowSpeed + 30;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", convertible=" + convertible + "]";
	}
	

}
