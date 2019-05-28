package java24;

public class MemberDao implements MemberInterface {

	@Override
	public void insert(MemberDto dto) {
		System.out.println("회원 가입");
	}
	
	@Override
	public void delete(String id) {
		System.out.println("회원 삭제");
	}

	@Override
	public void update(MemberDto dto) {
		System.out.println("회원 수정");
	}

	@Override
	public MemberDto select(String id) {
		MemberDto dto = new MemberDto("park", "park", "park", "park");
		return dto;
	}
	
	
	

}
