package ch09.sec07.exam01;

public class Car{
	private Tire tire1 = new Tire() { //재정의까지 시켜버림 선언한 코드가 아니라 실행되는 코드 실행문
		//타이어라는 타입에 값을 대입 대입연산실행 롤메서드 재정의 객체생성
		
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	private Tire tire2 = new Tire() {
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	private Tire tire3 = new Tire() {
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
		run3(tire3);
		run3(new Tire(){
			public void roll() {
				System.out.println("이건 한국타이어");
		}
	});
	}
	public void run2() {
		Tire tire = new Tire() {
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	public void run3(Tire tire) { //타이어의 자식들 구현클래스들은 모두 다 여기에 들어올 수ㅇㅆ음
		tire.roll();
	}
}
