package ch09.sec07.exam01;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire1  = new Tire() {
			
			
			public void roll() {
				System.out.println("타이어1 굴러갑니다");
			}
			
		};
		tire1.roll();
		Tire tire2 = ()-> {//똑같다
			System.out.println("타이어2 굴러갑닏.");

	};
	
	tire2.roll();
	}

}
