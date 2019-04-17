package data;

public class DataTest {

	public static void main(String[] args) {
		// comment, 주석, 설명 
		// 컨트롤 + / 하면 생김(한줄 주석)
		//sysout, syso + (컨트롤 + 스페이스바) : System.out.printin(); 자동 완성
		System.out.println("나의 데이터 프린트..");
		// 컨트롤 + S(저장)
		// 컨트롤 + F11(실행)
		
		//정수(integer, int)
		int spaceY = 300; //-21억 ~ 21억 사이
		//byte(1바이트, 8비트: -128~127) < short(2byte) < int(4byte) < long(8byte)
		
		
		
		int startX = 0;
		int startY = 0;
		
		int result = startX + startY;
		
		String result2 = "그래픽의 시작점 Y축은" + startY;
		
		System.out.println("그래픽의 시작점 X축은" + startX);
		System.out.println(result2);
		
		System.out.println();
		
		float x = 5.5f; // 뒤에 f 를 붙이면 float로 인식
		double y = 5.5;
		
		char gender = '남'; //char 는 '' 사용(한글자만 가능)
		boolean breakTime = true; // false(거짓) boolean은 참 거짓을 나타내기 위한 논리자료형
		
		//변수에 대입할 데이터 : 이름, 나이, 키, 몸무게, 시력, 성별
		//출력 데이터: 내 이름은 김 아무개 이고, 나이는 100세 입니다.
		//나의 키는 180.5이고, 몸무게는 99kg입니다.
		//시력은 1.5이고, 성별은 남입니다.
		
		
	}

}
