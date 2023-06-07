package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; //11 한실행문으로 대부분은 후위연산을쓴다
		++x; //12
//		x = x+1;
		System.out.println("x= "+x); //12
		
		System.out.println("--------------------------");
		y--; //9
		--y; //8
		System.out.println("y= "+y); //8
		
		System.out.println("--------------------------");
		z = x++; //z = 12
		
		System.out.println("z= "+z); //12
		System.out.println("x= "+x); //13
		
		System.out.println("--------------------------");
		z = ++x; //14
		
		System.out.println("z= "+z); //14
		System.out.println("x= "+x); //14
		
		System.out.println("--------------------------");
		z = ++x + y++; // x= 15 + y=8 23 y=9
		
		System.out.println("z= "+z); //23
		System.out.println("x= "+x); //15
		System.out.println("y= "+y); //9
	}

}
