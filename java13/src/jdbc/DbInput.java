package jdbc;

import java.util.Scanner;

public class DbInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�(1), ����(2), ����(3): ");
		int a = sc.nextInt();
		if(a == 1) {
			System.out.println("----ȸ�� ���� ���� �Է�----");
			System.out.print("���̵�: ");
			String id = sc.next();
			System.out.print("�н�����: ");
			String pw = sc.next();
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����ó: ");
			String tel = sc.next();
			
			DbTest2 db = new DbTest2();
			try {
				db.insert(id, pw, name, tel);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			else if(a==2) {
			System.out.println("----ȸ�� ���� ���� �Է�----");
			System.out.print("���̵�: ");
			String id2 = sc.next();
			System.out.print("�н�����: ");
			String pw2 = sc.next();
			System.out.print("�̸�: ");
			String name2 = sc.next();
			System.out.print("����ó: ");
			String tel2 = sc.next();
			DbTest2 db2 = new DbTest2();
			try {
				db2.update(id2, pw2, name2, tel2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			else if(a==3) {
			System.out.println("----������ ȸ�� ���� �Է�----");
			System.out.print("���̵�: ");
			String id3 = sc.next();
			System.out.print("�н�����: ");
			String pw3 = sc.next();
			System.out.print("�̸�: ");
			String name3 = sc.next();
			System.out.print("����ó: ");
			String tel3 = sc.next();
			DbTest2 db3 = new DbTest2();
			try {
				db3.delete(id3, pw3 , name3 , tel3);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}//else if end
		
	}//main end

}
