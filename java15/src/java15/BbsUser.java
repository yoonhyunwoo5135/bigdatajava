package java15;

import java.util.Scanner;

public class BbsUser {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ���̵� �Է� >> ");
		String inputId = sc.next();
		
		BbsDao dao = new BbsDao();
		BbsDto dto = dao.select(inputId);
		
		System.out.println("�˻��� id: " + dto.getId());
		System.out.println("�˻��� title: " + dto.getTitle());
		System.out.println("�˻��� content: " + dto.getContent());
		System.out.println("�˻��� etc: " + dto.getEtc());
		
	}
}
