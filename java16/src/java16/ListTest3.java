package java16;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		//������ �߿�.
		ArrayList list = new ArrayList();
		list.add("�赥��");
		list.add("�����");
		list.add("�豸��");
		list.add("���ڷ�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "00���� �� " + list.get(i));
		}
		System.out.println();
		System.out.println("200�� ���� Ż��, 300�� ���� ����");
		list.remove(1);
		list.set(2, "���漺");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 +  "00���� �� " + list.get(i));
		}
		
		
//		list.remove(0);
//		System.out.println(list);//toString ������
//		list.remove(1);
//		System.out.println(list);//toString ������
//		list.remove("����Ű");
//		System.out.println(list);//toString ������
		
		
	}

}
