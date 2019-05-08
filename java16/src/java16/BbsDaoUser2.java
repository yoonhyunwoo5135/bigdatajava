package java16;

import java.util.ArrayList;

public class BbsDaoUser2 {

	public static void main(String[] args) {
		BbsDao2 dao = new BbsDao2();
		ArrayList list = dao.selectAll();
		System.out.println(list.size());
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			BbsDto dto = (BbsDto)list.get(i);			
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getEtc());
			System.out.println();
		}
		
		
	}

}
