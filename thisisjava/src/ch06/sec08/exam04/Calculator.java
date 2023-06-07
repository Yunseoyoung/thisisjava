package ch06.sec08.exam04;

public class Calculator {
	
	static double pi = 3.141592;
	final int a;
	Calculator(){
		a=0;
		System.out.println("생성자 호출");
	}
	
	static {
		System.out.println("static 블럭"); //얘는 한번만 실행 메모리에 노드 될때
	}
	{
		System.out.println("인스턴스 블록"); //인스턴스는 객체 기준은 스테이틱 있고없고
	}
	double areaRectangle(double width) {
		return width * width;
	}
	double areaRectangle(double width, double height) {
		return width * height;
	}
	static void test() {
		double d = Math.PI;
//		Math.PI = 4.14;
//		double a = areaRectangle(10); //에러
	}//같은 인스턴스끼리는 에러안나
	double d = Math.PI;
//	Math.PI = 4.14;
}


