package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break; //enum 객체 굳이 필요없음
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		
		}
		
//		if(today == Week.SUNDAY) {
		if(week == 1) {	
			System.out.println("일요일에는 축구를 합니다");
		}else {
			System.out.println("열심히 자바를 공부합니다");
		}
		System.out.println(today); //객체를 그냥 출력하면 이거 신기하게 문자열로 출력되지만 그냥 객체는 이상하게 출력됨
		int[] arr = new int[] {1,2,3};
		System.out.println(arr); //클래스보면 대충알아볼순있다?
	}

}
