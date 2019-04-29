package java10;

public class Tv {
	//	 TV=> class
	//	 -정적특성: 전원버튼유무, 사이즈, 색 => 멤버 변수

	boolean power;
	int size;
	String color;

	//	 -동적특성: 채널변셩하다, 소리를 조절하다, 잭연결하다=> 멤버 메소드
	public void changeCh() {
		System.out.println("채널 변경하다.");
	}
	public void sound() {
		System.out.println("소리를 조절하다.");
	}
	public void connect() {
		System.out.println("잭 연결하다.");
	}
	
	@Override
	public String toString() {
		return power + " " + size + " " + color;
	}
	//toString() 재정의
	//=> 부모가 상속해준 메소드의 원래 기능을 바꾸어서 사용하는 것
	//=> 오버라이드(덮어씀)
	//기본형 변수 : 값을 출력
	//참조형 변수: 주소를 출력

}
