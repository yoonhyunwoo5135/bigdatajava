package control;

public class Day {

	public static void main(String[] args) {
		
		Day1 d1 = new Day1("�ڹ� ����", 10, "����");
		Day1 d2 = new Day1("����", 15, "������");
		Day1 d3 = new Day1("�", 11, "��Ʈ�Ͻ�");

		System.out.println("��ü �ϴ� ���� �ð���: " + d3.sum);
		System.out.println("��� �ϴ� ���� �ð���: " + d3.sum/3);
		
		
		System.out.println("1���� " + d1);
		System.out.println("2���� " + d2);
		System.out.println("3���� " + d3);
		
		System.out.println("��ĥ�� �ߴ���: " + d3.time3);
		
	}

}
