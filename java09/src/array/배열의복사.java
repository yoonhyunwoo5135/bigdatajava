package array;

public class 배열의복사 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3};//배열(참조, 주소)
		int num2 = 100; //정수(기본, 값)
		
		int num3 = num2;
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		num2 =555;
		
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
		System.out.println("----------------");
		
		int[] num4 = num;
		System.out.println("num[0]: " + num[0]);
		System.out.println("num4[0]: " + num4[0]);
		
		num[0] = 555;//얇은 복사
		
		System.out.println("num[0]: " + num[0]);
		System.out.println("num4[0]: " + num4[0]);
		
		System.out.println("----------------");
		
		
		int[] num5 = num.clone();// 깊은 복사
		num[0] = 999;
		System.out.println("num[0]: " + num[0]);
		System.out.println("num5[0]: " + num5[0]);
	}

}
