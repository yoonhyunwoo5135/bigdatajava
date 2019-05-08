package pos;

import java.util.ArrayList;

public class BbsDaoUser3 {

	public static void main(String[] args) {
		BbsDao3 dao = new BbsDao3();
		ArrayList list = dao.selectAll();
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			BbsDto2 dto = (BbsDto2)list.get(i);			
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getEtc());
		}
		
		
	}

}
