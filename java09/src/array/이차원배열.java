package array;

public class 이차원배열 {

	public static void main(String[] args) {
		int [][] seat = new int [3][10];
		int [][] num = {
				{1, 2},
				{4, 5, 6} // 2행 3열
						};
		
		System.out.println(num[0][1]);
		System.out.println(num[1][2]);
		System.out.println("배열의 개수: " + num.length);//length에는 행 개수만 들어감
		System.out.println("배열 0행의 열 개수: " + num[0].length);
		System.out.println("배열 1행의 열 개수: " + num[1].length);
		
		for (int i = 0; i < num.length; i++) {
			//1줄 프린트
			for (int j = 0; j < num[i].length; j++) { //num[i].length는 i행의 열의 크기
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
