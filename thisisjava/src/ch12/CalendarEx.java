package ch12;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 두날짜 사이의 간격TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		cal1.set(2023, 1, 1);
		cal2.set(2023, 1, 15);
		
		long diff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
		System.out.println(diff/1000/(60*60*24));
		//gragorianCalendar 가 정확하게 나옴
		//0시 0분 0초 약간의 오차가 
		// date객체랑 카렌더 객체랑 서로 변환이 가능함
		
	}

}
