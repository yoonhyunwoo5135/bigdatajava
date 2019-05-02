package jdbc;

import java.util.Scanner;

public class DbInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(1), 수정(2), 삭제(3): ");
		int a = sc.nextInt();
		if(a == 1) {
			System.out.println("----회원 가입 정보 입력----");
			System.out.print("아이디: ");
			String id = sc.next();
			System.out.print("패스워드: ");
			String pw = sc.next();
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("연락처: ");
			String tel = sc.next();
			
			DbTest2 db = new DbTest2();
			try {
				db.insert(id, pw, name, tel);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			else if(a==2) {
			System.out.println("----회원 수정 정보 입력----");
			System.out.print("아이디: ");
			String id2 = sc.next();
			System.out.print("패스워드: ");
			String pw2 = sc.next();
			System.out.print("이름: ");
			String name2 = sc.next();
			System.out.print("연락처: ");
			String tel2 = sc.next();
			DbTest2 db2 = new DbTest2();
			try {
				db2.update(id2, pw2, name2, tel2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			else if(a==3) {
			System.out.println("----삭제할 회원 정보 입력----");
			System.out.print("아이디: ");
			String id3 = sc.next();
			System.out.print("패스워드: ");
			String pw3 = sc.next();
			System.out.print("이름: ");
			String name3 = sc.next();
			System.out.print("연락처: ");
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
