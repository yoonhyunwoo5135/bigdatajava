package java23;

public class JungTest {
	//정규식테스트
	public static void main(String[] args) {
		String [] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c", "c0", "Car", "combat", "count", "date", "disc"};
		System.out.println(data.length);
		
		String s2 = "Hi, Hello!! call";
		
		String [] s3 = s2.split("H[a-z]");//H뒤에 한글자가 오는것을 추출
		String [] s4 = s2.split("H[a-z][a-z]");//H뒤에 두글자가 오는것을 추출
		for (String s : s3) {
			System.out.println(s);
		}
		for (String s : s4) {
			System.out.println(s);
		}
		
	}

}
