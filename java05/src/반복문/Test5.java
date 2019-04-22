package 반복문;


public class Test5 {

	public static void main(String[] args) {

	
		int mul = 0;
		
		for (int i = 1; i <= 9; i++) {
			
			mul++;
			
			for (int j = 1; j <= 9; j++) {

				int result = mul * j;
				System.out.println(mul + "X" + j + " = " + result);
			}
		}
		
	}

}
