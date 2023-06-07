package ch04;

public class Excer6 {

	public static void main(String[] args) {
		/*
*
**
***
****
*****

		행단위로 출력 (5개 행 반복)
		한 행 * (열)반복 (행의 수만큼)출력
		*/
		for (int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
