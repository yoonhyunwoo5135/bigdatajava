package 반복문;

public class ForTest1 {

	int test;//전역 변수(global)
	
	public static void main(String[] args) {
		
		//for(초기값; 조건식; 증감식) {
		
		int sum = 0;//지역 변수(local)
		int start; // 선언의 위치가 사용할 수 있는 범위
		for(start = 1; start <= 10; start++) {
			sum = sum + start;
			
		}
		System.out.println(start + "부터 10까지의 합은: " + sum );
		
	}

}
