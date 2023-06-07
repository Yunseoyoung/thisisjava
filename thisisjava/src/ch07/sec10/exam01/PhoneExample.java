package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone smartPhone = new SmartPhone("홍길동");
		
		smartPhone = new PdaPhone("ddd");
		smartPhone.turnOn(); //재정의된 메서드가 실행
		//무조건 재정의해
//		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
