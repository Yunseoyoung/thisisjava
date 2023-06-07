package ch05;

public class RefType {

	public static void main(String[] args) {
		/*
		 * 기본/참조 자료형
		 * 참조자료형 : 변수에는 메모리 주소값 저장
		 * 	- 배열, 클래스, 인터페이스...
		 * 	- 동등비교(==, !=) : 메모리 주소값 비교
		 * 	- null값 참조하는 주소가 없는 상태 널포인터익셉션에러
		 * 
		 * 
		 */
		// 객체 비교
		RefType rt = new RefType();
		RefType rt2 = new RefType();
		// 타입은 같지만 다른 객체
		System.out.println(rt == rt2);
		RefType rt3 = rt2; //메모리 주소값 대입
		System.out.println(rt3 == rt2);
		/*
		 * String
		 * - 동등비교 시 반드시 equals()메서드 사용
		 * - 불변( immutable )
		 * - 기능(메서드) : split, replace공백제거할때도 뭐를 없애는 기능도한다,
		 * indexOf, substring,valueOf.. 다른타입을 스트링으로 바꿔주는 것도
		 * 없으면 만들어라?
		 */
		String text = "안녕하세요, 저는 홍길동입니다.";
		String text2= text.replace(",", "");
		String text3 = text2.replace(" ", "");
		System.out.println(text3);
		
		//메서드 체이닝
		String text4 = text.replace
				(",",
						"")
				.replace(" ","");
		System.out.println(text4);//.은 줄바굼가능 괄호도 컴마도 더하기도 변수 옆으로 가는거 탭으로 가능 또는 똑같은거 쓰면돼 컴마나 괄호  
	
		/*
		 * 배열
		 * - 하나의 타입만 가능
		 * - 길이가 정해지면 변경 불가
		 * - 인덱스(순번), 0부터 시작
		 * 메뉴도배열 여러개잇으면 디비에서 셀렉트한것도 배열
		 * 나중에 포문이랑 같이 사용되는 경우가 많다
		 * 형태가 정해져있다
		 * for(int i=0; i<배열변수.length;i++)
		 */
//		int[] arr = new int[] {1,2,"3"};
		double[] arr = new double[] {1.5,1.2,1}; //자동형변환 하나의 타입
	
//		System.out.println(arr[2]);
		// arr2(길이가4) ㄹ길이네개짜리로만들고 하나씩 옮겨
		double[] arr2 = new double[4]; //자리생기면서 알아서 초기회ㅏ {0.0,0.0}
		for (int i=0;i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		for (int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]); //새로운배열을 만들어냄
		}
		
	}
	

}
