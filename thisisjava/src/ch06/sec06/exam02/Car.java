package ch06.sec06.exam02;

public class Car {
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정"; 
	int maxSpeed =350;
	int speed;//바뀌니까
	
	Car(String model, String color, int maxSpeed){
		//초기화
		this.model = model; //지자신한테 지자신이 원래있던값 아무의미없는코드
		this.color = color; //this는 객체 자기 자신 객체안에서 실행되니까 this는 매번 달라짐
		//마이카일수도 유어카일수도 또 다른거일수도
		this.maxSpeed = maxSpeed; //지역변수
	}
	/*Car(String m, String c, int mS){
		//초기화
		model = m; //지자신한테 지자신이 원래있던값 아무의미없는코드
		color = c; //this는 객체 자기 자신 객체안에서 실행되니까 this는 매번 달라짐
		//마이카일수도 유어카일수도 또 다른거일수도
		maxSpeed = mS; //지역변수
	}*/
	int car() {
		return 1;
	}
	/*
	Abc(){//메서드
		return 2;
	}*/
	//speed 필드 초기화
	Car(int a){//하나라도 있으면 자동으로 안만들어줌 오버로딩 매개변수가 하나또는 여러개
		speed = a;
	}
	Car(String a){//하나라도 있으면 자동으로 안만들어줌 오버로딩 매개변수가 하나또는 여러개
		
	}
	
	Car(int a, int b){//하나라도 있으면 자동으로 안만들어줌 오버로딩 매개변수가 하나또는 여러개
		
	}	//개수 타입 순서
	
	Car(){
		System.out.println("생성자 호출");
	}


}
