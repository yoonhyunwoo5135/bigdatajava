package java16;

import java.util.ArrayList;

public class MemberDao {
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		//dto를 3개 만들어서 list로 묶으세요
		//그 리스트를 리턴
		MemberDto m1 = new MemberDto("100", "1234", "java", "8895"); 
		MemberDto m2 = new MemberDto("200", "5678", "java1", "7795"); 
		MemberDto m3 = new MemberDto("300", "9012", "java2", "6695"); 
		MemberDto m4 = new MemberDto("400", "3456", "java3", "5595"); 
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		return list;
	}
}
