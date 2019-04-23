package array;

public class 배열연습4 {

	public static void main(String[] args) {
		int[] num1 = {1, 2, 3};
		int[] num2 = num1; //주소 값이 복사 됨. 
		
		System.out.println(num2); //[@15db9742
		
		
		//배열에는 값과 주소가 복사 가능하다.
		//기본형은 값을 복사하며, 나머지는 주소 복사만 가능하다.
		
		//변수의 종류
		//기본형 - 정수, 실수, 문자, 논리 값이 저장
		//참조형 - 기본형이 아닌 것 다 배열, 컬렉션, String, class.....등의 주소가 저장.
	
	}
}
