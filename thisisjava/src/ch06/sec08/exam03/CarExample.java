package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
//		myCar.gas = 5;
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) { //불리언이다
			System.out.println("출발합니다.");
			myCar.run();
			
		}
		System.out.println("gas를 주입하세요.");
	}

}

