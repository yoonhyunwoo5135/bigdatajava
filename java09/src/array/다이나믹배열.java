package array;

public class 다이나믹배열 {

	public static void main(String[] args) {
		int[][] num = new int[2][];// 행만 잡아두는 것이 가능
		num[0][2] = 100;
		System.out.println(num[0][2]);//메모리를 잡아주지 않아서 에러가 남
		
	}

}
