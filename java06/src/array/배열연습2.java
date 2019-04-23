package array;

public class 배열연습2 {

	public static void main(String[] args) {
		int[] grade = {44, 66 , 22, 88};
	
		for (int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + " ");
		}
		System.out.println();
		System.out.println("리스트에 들어있는 값들의 개수: " + (grade.length));
		
		grade[0] = 55;
		
		for (int i = 0; i < grade.length; i++) {
			System.out.print(grade[i] + " ");
		}
		
	}
}

//변수의 종류
//기본형(basic) : 해당하는 타입의 value(값) 저장
//				(정수, 실수, 문자, 논리)
//참조형(reference) : address(주소) 저장
//				(기본형을 제외한 모든 데이터)
//				(기본형을 제외한 모든 데이터 String, 배열, 컬렉션, 클래스,...)