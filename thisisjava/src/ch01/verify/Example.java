package ch01.verify;



public class Example {
	public static void main(String[] args) {
		System.out.println("개발자가 되기 위한 필수 개발 언어 Java");
		
		int age; // 선언 
		int 나이;
		// 카멜표기법
		int shinhanStudentmMathScore;
		// 스네이크표기법
		int shinhan_student_math_score;
		
		//초기화하지 않으면 사용 불가
//		System.out.println(age);
		age = 10; //초기화
		System.out.println(age);
		
		//선언과 초기화 동시에
		int age2 = 2100000000;
		
		age2 = age; 
		
//		Example e;
		
		long var3 = 10000000000L;
		
		char c = 'A';
		System.out.println(c+1);
		
		byte b = 1;
//		byte d = b+2; //정수로 바뀜 에러
		
		
//		Example e = new Example();
		var e = new Example();
		System.out.println(e);
		
	}
}