package java20;

import java.util.Calendar;

public class CalendarTest {
	
	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));//년
		System.out.println(today.get(Calendar.MONTH));//월 + 1 해줘야 함
		System.out.println(today.get(Calendar.DATE));//일
		System.out.println(today.get(Calendar.DAY_OF_WEEK));//요일
		System.out.println(today.get(Calendar.HOUR));//12시간 기준
		System.out.println(today.get(Calendar.HOUR_OF_DAY));//24시간 기준
		System.out.println(today.get(Calendar.DAY_OF_YEAR));//올해 현재 일 수 
		System.out.println(today.get(Calendar.MINUTE));//분
		System.out.println(today.get(Calendar.SECOND));//초
		System.out.println(today.get(Calendar.AM_PM));//오전 오후 0 = AM, 1 = PM
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));//1년 기준 몇주차 인지
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));//한달 기준 몇주차 인지
		
		System.out.println("오늘은 " + today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월 " + today.get(Calendar.DATE) + "일 입니다.");
		
		
	}
	
	
}
