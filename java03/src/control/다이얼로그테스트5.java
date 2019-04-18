package control;

public class 다이얼로그테스트5 {

	public static void main(String[] args) {
		double pi = 3.14;
		int r = 12;
		int r2 = 10;
		double result = pi*r*r;
		double result3 = pi*r2*r2;
		
		int width = 11;
		int height = 22;
		int result2 = width*height;
		
		System.out.println("원의 면적은" + result);
		System.out.println("사각형의 면적은" + result2);
		System.out.print("가로 세로가 같은가요? ");
		
		if (width == height) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
			
		}
		System.out.print("반지름이 10보다 큰가요? ");
		
		
		if(result > result3) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
			
		}
		
	}

}
