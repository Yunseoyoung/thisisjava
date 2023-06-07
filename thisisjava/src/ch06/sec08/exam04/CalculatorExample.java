package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		System.out.println("main메서드 시작");
		Calculator myCalcu = new Calculator();
		double result1 = myCalcu.areaRectangle(10); //자동형변환
		double result2 = myCalcu.areaRectangle(10,20);
		
		System.out.println("정사각형 넓이="+result1);
		System.out.println("직사각형 넓이="+result2);
		
//		Calculator.pi;
		System.out.println(Calculator.pi);
		System.out.println(myCalcu
				.pi);
		
		Calculator myCalcu2 = new Calculator();
		Calculator myCalcu3 = new Calculator();
		Calculator myCalcu4 = new Calculator();
		
//		Calculator.pi = 4.14;
		Calculator.pi = 4.14; //스테이틱은 공유
		
	}

}
