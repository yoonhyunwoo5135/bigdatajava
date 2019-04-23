package array;

public class 배열연습3 {

	public static void main(String[] args) {
		int[] num = {444, 666, 777};
		//배열의 첫번째 값에 세번째 값을 넣어 보세요.
		int a = num[0];
		num[0] = num[2];
		num[2] = a;
		//첫번째 값을 확인, 세번째 값을 확인.
		System.out.println(num[0]);
		System.out.println(num[2]);
		
	
	}
}
