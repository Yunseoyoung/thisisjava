package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		//기본생성자가 자동으로 만들어져서 그거 가지고 객체를 만듬
		
		myCalc.powerOn(); //객체를 통해 파워온 메서드를 실행 클래스가 실행되는건 아니지만 설계도임
		//이러면 이렇고 저러면 저렇고 모델링 얘가 움직이는건아니고
		
		int result = myCalc.plus(5, 6);
		System.out.println("result: "+result);
		int x= 10;
		int y=4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		myCalc.powerOff(); //실행되는코드가 아니고 어딘가에서 생성됐다고 가정하고 
	}

}
