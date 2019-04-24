package 배열;


public class Test5 {
	
	public static void main(String[] args) {
		int[] num = {66, 77, 88, 99};
		int imsi = num[0];
		num[0] = num[3];
		num[3] = imsi;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("최대값은 " + max);
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최소값은 " + min);
	}

}
