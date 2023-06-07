package ch07.sec10.exam01;

public class PdaPhone extends Phone {

	PdaPhone(String n) {
		super(n); //생성자
		// TODO Auto-generated constructor stub
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("PDA폰 전원 켜기");

	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("PDA폰 전원 끄기");
		
	}

}
