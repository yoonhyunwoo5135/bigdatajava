package java16;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		//������ �߿�.
		ArrayList list = new ArrayList();
		list.add("�ڽ�Ű");
		list.add("�۽�Ű");
		list.add("�轺Ű");
		list.add("����Ű");
		int size = list.size();
		System.out.println("����Ʈ�� ������ " + size + "��");
		System.out.println(list);//toString ������
		list.remove(1);
		System.out.println(list);//toString ������
		list.add(1, "���ι�");//�߰�
		System.out.println(list);//toString ������
		list.set(1, "�õ��ι�");//���� ���� set
		System.out.println(list);//toString ������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i  +  1 +  "��:" + list.get(i));
		}
		
		
//		list.remove(0);
//		System.out.println(list);//toString ������
//		list.remove(1);
//		System.out.println(list);//toString ������
//		list.remove("����Ű");
//		System.out.println(list);//toString ������
		
		
	}

}
