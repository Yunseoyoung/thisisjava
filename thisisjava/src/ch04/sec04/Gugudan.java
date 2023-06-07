package ch04.sec04;

public class Gugudan {

	public static void main(String[] args) {
		/*
		 * 
		 */
		//변수 1~9까지 1씩 증가
		for (int j=2; j<=9; j++) { //8번
			for(int i=1;i<=9;i++) { //9번 총 72번
				System.out.println(j + " X "+i+" = "+j);
			}
		}
		System.out.println("2 X 1 = 2"); //2씩 증가
		System.out.println("2 X 2 = 4");
		System.out.println("2 X 3 = 6");
		
		for(int i=1;i<=9;i++) {
			System.out.println(2+" X "+ i +" = " +i*2);
		}
		
		target:for(int i=2;i<=9;i++) {
			System.out.println("***["+i+"단]***");
			for(int j=1; j<=9 ;j++) {
				System.out.println(i+ " X "+ j+ " = "+ i*j); //i로쓰는이유 인덱스라는게있어서 상관없긴함
				if(i==3) break target;
				//변수는 따옴표바깥에 있어야함
			}
			for(int j=1; j<=9 ;j++) {
				System.out.println(i+ " X "+ j+ " = "+ i*j); //i로쓰는이유 인덱스라는게있어서 상관없긴함
				
				//변수는 따옴표바깥에 있어야함
			}
			
		}
		/*for(;;) {
			System.out.println("무한");
		}*/
	}

}
