package hey;

public class Main {

	public static void main(String[] args) {
		Member m1 = new Member("�Ӿƹ���", "��", 24);
		Member m2 = new Member("��ƹ���", "��", 23);
		Member m3 = new Member("�ھƹ���", "��", 25);
		
		System.out.println("��ü ���� ����: " + m3.membercount);
		System.out.println("�������� ��� ����: " + m3.agesum/m3.membercount);
		System.out.println("ù��° ������ �̸���: " + m1.name);
		
	}

}
