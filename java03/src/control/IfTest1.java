package control;

public class IfTest1 {

	public static void main(String[] args) {
		//if뒤에는 반드시 조건을 쓴다.
		//조건의 결과는 boolean(논리형, true/false)
		int food = 2;//콘솔에서 입력
		
		if(food == 1){
			System.out.println("짜장면을 선택");
			
		}
		else if(food == 2){
			System.out.println("짬뽕을 선택");
			
		}
		else if(food == 3) {
			System.out.println("우동을 선택");
			
		}
		else {
			System.out.println("없는 메뉴입니다. 다시 선택해주세요");
			
		}
		
		
	}//main end.

}//class end.

/* [] : 대, 배열
 * {} : 중, 포함, 묶어주는 역할
 * () : 소, 함수의 입력값
 * <> : 제네릭 프로그래밍
 */
