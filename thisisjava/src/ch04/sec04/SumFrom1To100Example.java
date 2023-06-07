package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
			int i =0;
			int sum = 0;
			for(i=0; i<=100; i++) { 
//				sum +=i;
				sum = sum+i;
			} //하나의 변수로 0부터 10까지 반복되는
			System.out.println("1~"+(i-1)+" 합:"+sum);
			
			
			System.out.println(i);
			
			
			System.out.print(0 + " ");
			System.out.print(1 + " ");
			System.out.print(2 + " ");
			System.out.print(3 + " ");
			System.out.print(4 + " ");
			System.out.print(5 + " ");
			System.out.print(6 + " ");
			System.out.print(7 + " ");
			System.out.print(8 + " ");
			System.out.print(9 + " ");
			System.out.print(10 + " ");
	}

}
