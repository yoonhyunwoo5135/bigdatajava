package control;

public class Day {

	public static void main(String[] args) {
		
		Day1 d1 = new Day1("자바 공부", 10, "강남");
		Day1 d2 = new Day1("여행", 15, "강원도");
		Day1 d3 = new Day1("운동", 11, "피트니스");

		System.out.println("전체 하는 일의 시간은: " + d3.sum);
		System.out.println("평균 하는 일의 시간은: " + d3.sum/3);
		
		
		System.out.println("1일차 " + d1);
		System.out.println("2일차 " + d2);
		System.out.println("3일차 " + d3);
		
		System.out.println("며칠간 했는지: " + d3.time3);
		
	}

}
