package java16;

import java.util.ArrayList;

public class BbsDao {
	
	public ArrayList selectAll() {
		BbsDto b1 = new BbsDto("100", "java", "fun java", " java");
		BbsDto b2 = new BbsDto("200", "jsp", "fun jsp", " jsp");
		BbsDto b3 = new BbsDto("300", "Swing", "fun Swing", " Swing");
		BbsDto b4 = new BbsDto("400", "Spring", "fun Spring", " Spring");
		ArrayList list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		
		
		
		
		
		return list;
//		System.out.println(list);
//		System.out.println(list.get(0));
//		
//		BbsDto dto = (BbsDto)list.get(0);
//		
//		System.out.println(dto.getId());
//		System.out.println(dto.getTitle());
//		System.out.println(dto.getContent());
//		System.out.println(dto.getEtc());
//		System.out.println();
//		
//		dto = (BbsDto)list.get(3);
//		System.out.println(dto.getId());
//		System.out.println(dto.getTitle());
//		System.out.println(dto.getContent());
//		System.out.println(dto.getEtc());
		
		
		}
	
}
