package java23;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.random());//0.0에서 1.0 사이에 숫자를 랜덤으로 생성
		int num = (int)(Math.random()+ 10);//최소값을 설정 가능
		num = (int)(10 + (Math.random()* 12));//10에서 22값사이서 랜덤값 생성
		System.out.println(num);
		
		double num2 = 12345.6789;
		System.out.println(Math.ceil(num2));
		System.out.println(Math.floor(num2));
		System.out.println(Math.round(num2));
		
		final double NUM = 1000;
		//final은 변경 불가
		//상수를 나타낼때에는 final을 사용
		//데이터를 넣어 둘 때 사용
		//상수에 들어간 데이터는 변경 불가
		//일반 변수와 비교하기 위해 대문자로 써두는 것이 일반적
		
		int num3 = -100;
		System.out.println(Math.abs(num3));
		
		int num4 = -200;
		System.out.println(Math.max(num3, num4));
		System.out.println(Math.min(num3, num4));
		int num5 = 3;
		System.out.println(Math.pow(num5, 3));
		
		Random r = new Random();
		r.setSeed(100);
		System.out.println(r.nextInt(100));
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));
		}
		
	}

}
