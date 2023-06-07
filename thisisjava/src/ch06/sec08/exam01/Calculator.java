package ch06.sec08.exam01;

public class Calculator {

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		Calculator c = new Calculator(); //다른 객체
		int a = c.plus(1,2); //같은객체는 안써도 돼고
//		int a = plus(1.,22.0);
		double result = (double) x / (double) y;
		return result;
	}

}
//메인 메소드가 없어서 실행하는 게 아니다