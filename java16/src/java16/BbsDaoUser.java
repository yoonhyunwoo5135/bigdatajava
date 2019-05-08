package java16;

import java.util.ArrayList;

public class BbsDaoUser {

	public static void main(String[] args) {
		BbsDao dao = new BbsDao();
		ArrayList list = dao.selectAll();
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			BbsDto dto = (BbsDto)list.get(i);			
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getEtc());
		}
		
		
	}

}
