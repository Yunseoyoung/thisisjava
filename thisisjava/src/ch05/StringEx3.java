package ch05;

public class StringEx3 {
//	static String model; //필드
	public static void main(String[] args) {
		String a = new String();
		String b = a;
		System.out.println(a == b);
		a = "안녕";// 기본연산만 가능 객체는 아니돼 스트링만 예외
		System.out.println(a == b);
		
		
		Str a2 = new Str(); //생성된 객체의 주소
		Str b2 = a2;
		System.out.println(a2 == b2);
		a2.name = "안녕";
		
		System.out.println(a2 == b2);
		System.out.println(b2.name);
		
		System.out.println(a2);
		System.out.println(new Str()); //하나의 값
		
//		String model; //지역변수
		System.out.println(model);
	}
	
	static void test() {
		String model=""; //안쪽이랑 필드랑 상관없다
		System.out.println(model);
	}
	void test(String model) { //매개변수 회색 근처에 있는놈이 영향끼침
	
		System.out.println(this.model); //객체 필드를 가리킬려면 this
	}
	
	static String model; //필드는 위든 밑이든 상관없어 필드는 색깔 파란색

}

class Str {
	String name; //필드 객체가있어야 필드를쓸수있어 모든게 클래스단위로 클래스끼리는 연결못함 하려면 객체를 통해서
}
