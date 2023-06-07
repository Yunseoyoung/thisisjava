package ch12.sec03.exam05;

import java.util.Random;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m = new Member();
		m.setId("hong");
//		m.id ="hong"; //남들이하니까
		m.setName("홍길동바보");
//		m.name ="홍길동";
		System.out.println(m.getName());
		System.out.println(m);
		System.out.println(m.toString()); //롬복이 재정의해놓음
		System.out.println(System.getProperty("java.specification.version"));
		
		
		// 배열에다가 숫자, 문자, 문자열, Member 객체
		Object[] obj = {1,3.14,'A',"ABC",new Member()};
		// auto boxing
		Object[] obj2 = {new Integer(1),3.14,'A',"ABC",new Member()};
		//인티저 래퍼클래스타입에 들어감 똑같다 자동으로 바뀐다
		
		Integer i = 1; //boxing
		int i2 = i; // unboxing
		
		
		test(1); //오브젝트
		test(1.5);
		test("aa");
		test(new Member());
//		Math.round(3.123456, 3); //없음
		double d = Math.round(3.123456*1000)/1000.0;
		System.out.println(d);
		
		
		Random r1 = new Random();
		System.out.println(r1.nextInt(10));
		Random r2 = new Random();
		System.out.println(r2.nextInt(10));
		
//		Member m = new Member();
//		m.
		
		
//		test(new Admin());
		
		
		
	}
	
	public static void test(Object o) {
		System.out.println();
	}
	
//	public static void test()

}
