package java16;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		//순서가 중요.
		ArrayList list = new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등:" + list.get(i));
		}
		System.out.println();
		System.out.println("2등 반칙패");
		list.remove(1);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "등:" + list.get(i));
		}
		
		
//		list.remove(0);
//		System.out.println(list);//toString 재정의
//		list.remove(1);
//		System.out.println(list);//toString 재정의
//		list.remove("정스키");
//		System.out.println(list);//toString 재정의
		
		
	}

}
