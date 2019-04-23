package array;

public class 배열연습1 {

	public static void main(String[] args) {
		String[] names = {"김길동","홍길동","박길동"};
		System.out.println(names);
		System.out.println(names[0]);
		//위치 값을 가지고 배열에 들어있는 값들을 구분
		//위치값 = index(인덱스), 0부터 시작
		System.out.println(names[2]);
		System.out.println(names.length);//names.length 는 읽기 전용
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
	}

}

//변수의 종류
//기본형(basic) : 해당하는 타입의 value(값) 저장
//				(정수, 실수, 문자, 논리)
//참조형(reference) : address(주소) 저장
//				(기본형을 제외한 모든 데이터)
//				(기본형을 제외한 모든 데이터 String, 배열, 컬렉션, 클래스,...)