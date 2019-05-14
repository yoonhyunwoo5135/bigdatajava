package java20;

import java.util.Calendar;

public class CalendarTest {
	
	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));//��
		System.out.println(today.get(Calendar.MONTH));//�� + 1 ����� ��
		System.out.println(today.get(Calendar.DATE));//��
		System.out.println(today.get(Calendar.DAY_OF_WEEK));//����
		System.out.println(today.get(Calendar.HOUR));//12�ð� ����
		System.out.println(today.get(Calendar.HOUR_OF_DAY));//24�ð� ����
		System.out.println(today.get(Calendar.DAY_OF_YEAR));//���� ���� �� �� 
		System.out.println(today.get(Calendar.MINUTE));//��
		System.out.println(today.get(Calendar.SECOND));//��
		System.out.println(today.get(Calendar.AM_PM));//���� ���� 0 = AM, 1 = PM
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));//1�� ���� ������ ����
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));//�Ѵ� ���� ������ ����
		
		System.out.println("������ " + today.get(Calendar.YEAR) + "�� " + (today.get(Calendar.MONTH) + 1) + "�� " + today.get(Calendar.DATE) + "�� �Դϴ�.");
		
		
	}
	
	
}
