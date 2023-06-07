package ch06.sec15;

public class Singleton {
	private static Singleton singleton = new Singleton(); //맨처음에 메모리로 노드
	
	private Singleton() {
		
	}//자기 클래스안쪽말고 다른 그어떤곳에서도 new해서 싱글톤객체생성못함 안보인다고
	//실행되면 객체가 달라짐 생성자 못쓰게 막아놓음
	
	public static Singleton getInstance() {
		return singleton;//인스턴스로하면 객체가없으면 호출이안되면 안돼 프라이빗으로 막아놔서 반드시 스테이틱으로 해놔야 가져올수있어
	}

}
