package java16;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		//������ �߿�.
		ArrayList list = new ArrayList();
		list.add("�ڼ���");
		list.add("������");
		list.add("������");
		list.add("�谳��");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "��:" + list.get(i));
		}
		System.out.println();
		System.out.println("2�� ��Ģ��");
		list.remove(1);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "��:" + list.get(i));
		}
		
		
//		list.remove(0);
//		System.out.println(list);//toString ������
//		list.remove(1);
//		System.out.println(list);//toString ������
//		list.remove("����Ű");
//		System.out.println(list);//toString ������
		
		
	}

}
