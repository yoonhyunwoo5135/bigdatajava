package java16;

import java.lang.management.MemoryUsage;
import java.util.ArrayList;

public class MemberDaoUser {
	
	public static void main(String[] args) {
		//멤버리스트 리턴받아 출력
		//전체 출력
		MemberDao dao = new MemberDao();
		ArrayList list = dao.selectAll();
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		for (int i = 0; i < list.size(); i++) {
			MemberDto dto = (MemberDto)list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getPw());
			System.out.println(dto.getName());
			System.out.println(dto.getTel());
			
			
		}
		
		
		
	}
}
