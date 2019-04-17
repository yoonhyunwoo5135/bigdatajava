package cal;

public class Test2 {

	public static void main(String[] args) {
		
		int a = 200;
		int b = 100;
		int result = a + b;
		
		if(result > 300){
			System.out.println(300-100);
			
			
		}
		else {
			System.out.println(300*0.1);
			
		}
		
		int c = 400;
		
		int result2 = c % 2;
		if(result2 == 0) {
			System.out.println("짝수 입니다.");
			
		}
		else {
			System.out.println("홀수입니다.");
		
		}
		
		System.out.println("----삼항연산자로 출력");
		
		System.out.println(result2 == 0 ? "짝수 " : "홀수");
		
		//프로그램은 내가 써준 순서대로 실행
		//=> 순차적으로 진행
		//조건에 따라서 분기해야 할 때도 있다.
		//=>조건문(분기문) 사용
		//조건에 따라서 반복해야 할 때도 있다.
		//=>반복문 사용
	
	}

}
