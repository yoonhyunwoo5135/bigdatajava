package bank;

public class Main {
	
	public static void main(String[] args) {
		
		Member name = new Member("청약저축", "김아무개", 500);
		Member name1 = new Member("내비상금", "김아무개딸", 30);
		Member name2 = new Member("자유적금", "박아무개", 100);
		
		
		System.out.println("객체 생성 후 다음과 같이 출력해 보세요");
		System.out.println("-----------------------------");
		System.out.println(name1.product + " 통장에는 " + name1.money + "만원이 들어있어요." );
		System.out.println(name2.name + "의 통장에는 " + name.money + "만원이 들어있어요.");
		int result = name.money + name1.money + name2.money;
		System.out.println("우리집 전체 예금액은" + result + "입니다.");
		
		
		
	}
	
}
