package control;

public class Day3 {

	public static void main(String[] args) {
		/* 오늘 아침에 대한 정보 출력(변수에 저장해서 출력)
		 * ---------------------
		 * 오늘 아침을 먹고 왔나요: true
		 * 오늘 타고온 버스의 번호나 지하철 노선은 : 2호선
		 * 오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는: 9
		 * 오늘 부터 프로젝트 함께할 우리 조원의 이름은: 홍길동
		*/		
		
		String breakf = "true";
		int sub = 2;
		double yesd = 10.5;
		double today = 9;
		String name = "홍길동";
		
		
		System.out.println("---------------------");
		System.out.println("오늘 아침을 먹고 왔나요: " + breakf);
		System.out.println("오늘 타고온 버스의 번호나 지하철 노선은: " + sub + "호선");
		System.out.println("오늘은 어제(" + yesd + ")보다 5.5도 낮아요. 오늘의 온도는 : " + today);
		System.out.println("오늘 부터 프로젝트 함께할 우리 조원의 이름은: " + name);
		
		
	}

}
