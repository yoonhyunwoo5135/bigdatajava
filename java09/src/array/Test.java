package array;

public class Test {

	public static void main(String[] args) {
		//1반은 44, 55, 66
		//2반은 77, 88, 99, 100
		//각반의 평균을 구하세요.
		//전체 출력
		int i;
		int j;
		int result = 0;
		
		int [][] cla = {
				{44, 55, 66},
				{77, 88, 99, 100}
				};
		
		
		for (i = 0; i < cla.length; i++) {
			for (j = 0; j < cla[i].length; j++) {
				result = result + cla[i][j];
			}
			System.out.println(i+1 + "반의 평균은: " + result/cla[i].length);
			result = 0;
		}
		
	}

}
