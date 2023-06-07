package ch02;

public class Var {

	public static void main(String[] args) {
		/*
		 * 변수 (Variable) 몇수를 내다본다 할때 그런 수 변할 수 변할 수 있는 수
		 * - 변할 가능성
		 * - 다른곳에서 사용
		 * 
		 * 
		 */
		// 변수 정의
		// 선언 (미리)
		// 나 이거 쓸거야
		// 타입 변수명;
		int number;
		// 선언만 한 상태에서는 사용불가 연산출력다안돼 (지역변수)
		//System.out.println(number);
		// 반드시 초기화 후 사용 지역변수 변수의 사용범위 이거에 따라 달라진다 모든 변수가 다 이런건 아님 지역변수 일때만 그럼 local variable
		number = 10; //초기화
		System.out.println(number);
		// 선언과 초기화 동시에
		int n = 1;
		// 다른 타입의 값을 대입 불가
//		n = 3.14;
		/*
		 * 자료형(타입, 데이터타입, 데이터형, 자료타입, (자료형 제일 많이씀...) 다 같은말 데이터가 자료고 타입이 형 부르는 사람 마음
		 * 기본자료형 (정수, 실수, 논리), byte, short, int
		 * - 정수? -> int, 21억넘어? ->long, 소수점? ->double
		 * int < 1ong < double
		 * - 참/거짓? -> boolean
		 * 
		 * 참조자료형
		 */
		n = 2;
		n = 3;
		n = 4;
//		n = 3.14; // type mismatch
		double d = 3.14;
		d = 3.15;
		d = 1; //자동형변환
		d = (double)1; //강제형변환
		System.out.println(d);
		//클래스랑객체에서똑같은개념
		/*
		 * 자동형변환
		 * - 작은범위의 타입 -> 큰범위의 타입
		 * 강제형변환
		 * - (타입)
		 * - 범위에서 벗어나는 부분 유실
		 * 
		 */
		d = 1.5;
		int n2 = (int)d;
		System.out.println(n2);
		
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)(b1 + b2); //3이 대입되는건데 3이라고 쓰면 에러가 안나 변수로 쓰면 인트래 연산으로 하면 바껴버려

		// 문자열과 +연산
		String s ="홍길동"+3; //전부다 문자열로 바뀜
		String s2 ="1"+3; //전부다 문자열로 바뀜 13
		
		//문자열 -> 기본타입
		/*
		 * int -> Integer
		 * long -> Long
		 * double -> Double 첫자대문자는 기본적으로제공되는 클래스 클래스를 쓰는거야
		 * 클래스안에 함수랑 비슷한 메서드가 있어 메서드가 기능을 하는거고 안에보면 .parseXXX파스어쩌구 이름
		 * .parseXXX()
		 * 
		 * 
		 */
		//문자열->정수/실수
		// 평균내려면 정수로바꿔야
		String age = "30";
		int age2 = Integer.parseInt(age); //첫자가 대문자인 클래스이름 . 파스 어쩌구 더블로 바꾸고 싶으면 파스 더블 롱으로바꾸고싶으면 파스 롱
		//문자열넣으면 정수로 바꿔줌 함수처럼 숫자 30 //많이씀
		
		long age3 = Long.parseLong(age);
		double age4 = Double.parseDouble(age); //문자열은 더하기연산 갖다붙이는것밖에안되니까 산술연산하려고 숫자로~~~~~~~~ 정수나 실수로
		
		// 정수/실수 -> 문자열
		String age5 = String.valueOf(age4); //정수실수든뭐든 다 문자열로 바꿔줌
		String age6 = age4+"";
		
		
		//문자열 비교
		String id = "admin"; //스트링은 참조자료형 객체이다
		
		System.out.println(id);
		String id2 = new String("admin");
		System.out.println(id2);
		System.out.println(id == id2); //메모리주소 비교 주소가 다름
		//문자열을 이렇게 비교하면 안됨 그래서
		System.out.println(id.equals(id2)); //문자열에 있는 값을 가지고 비교
		//문자열은 반드시 이퀄즈 메서드를 써라!!!!!!!!!!!!
		
		// 아이디가 admin이면 관리자 출력
		
		if (id.equals("admin")) {
			System.out.println("관리자");
		}//id가 널이면 에러
			
		if ("admin".equals(id)) {
			System.out.println("관리자");
		} //id가 널이어도 에러가 안남

		//문자열을 앞에다써
		//운전할때 다른차 흐름을 미리 보고 피한다거나 에러날수도있고 안날수도있지만 미리 예상 애초코딩때 아예 에러가 안나게 방어코딩
		
//		short sh =c;
		
//		System.out.print();
		
		int a = 10; //db.select 뭐가 들어올지 알 수 없음
		int b = 3;
		System.out.println(a / (double)b); //정수나오니까 실수로바꿔야겠다
		System.out.println(a/b); //몫
		System.out.println(a%b); //나머지
	}

}
