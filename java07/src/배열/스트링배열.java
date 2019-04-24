package 배열;


public class 스트링배열 {

	public static void main(String[] args) {
		int[] ages = {50, 100, 10};
		String[] names = {"홍길동", "박길동", "김길동"};
		names[2] = "김동길";
		names[names.length-1] = "김동순";
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
			
		}
		for (int i : ages) {
			System.out.println(i);
		}
		for (String imsi : names) { //foreach 메소드
			System.out.println(imsi);
		}
		
		
	}

}
