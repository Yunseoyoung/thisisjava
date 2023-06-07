package ch04;

public class Excer666 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
//			if(i==1) {
//				System.out.print("   ");
//			}else if(i==2 ) {
//				System.out.print("  *");
//			}else if(i==3) {
//				System.out.print(" **");
//			}else {
//				System.out.print("***");
			
//			} //1234 동안 빈칸은 3 2 1 0 , 별은 0 1 2 3 반복되면 for문
			
			for(int k=4;k>i;k--) {
				System.out.print(" ");
			}
			for(int h=1;h<i;h++) {
				System.out.print("*");
			}
			
			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
				System.out.print("*");
				if(j==2) {
//					System.out.println("*");
				}
				
			}
			System.out.println();
		}
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
				
				
//			}
	//}
//		System.out.println();
	}
	

}
