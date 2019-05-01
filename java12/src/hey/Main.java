package hey;

public class Main {

	public static void main(String[] args) {
		Member m1 = new Member("임아무개", "남", 24);
		Member m2 = new Member("김아무개", "여", 23);
		Member m3 = new Member("박아무개", "남", 25);
		
		System.out.println("전체 직원 수는: " + m3.membercount);
		System.out.println("직원들의 평균 나이: " + m3.agesum/m3.membercount);
		System.out.println("첫번째 직원의 이름은: " + m1.name);
		
	}

}
