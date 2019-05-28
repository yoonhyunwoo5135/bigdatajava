package java24;

public interface MemberInterface {
	//강제성있는 기능을 추상 메소드로 정의
	//일반 변수 사용 불가
	//추상적 <--> 구체적
	//추상: 불완전하다.
	//인터페이스는 객체를 생성하여 쓸 수 없다.
	
	public abstract void insert(MemberDto dto);
	public abstract void delete(String id);
	public abstract void update(MemberDto dto);
	MemberDto select(String id);
	
	
}
