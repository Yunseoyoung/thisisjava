package ch04;

public class Excer05 {

	public static void main(String[] args) {
		/*
		 *  4x + 5y = 60의 모든 해
		 *  (x, y) 출력
		 *  1~10 자연수
		 * 
		 */
		for (int x=1;x<=10;x++) {
			for (int y=1;y<=10;y++) {
				if(x*4 + 5*y ==60) {
					System.out.println("("+x+","+y+")");
				}
				}
		}
	}

}
