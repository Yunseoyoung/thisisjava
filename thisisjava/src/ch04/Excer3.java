package ch04;

public class Excer3 {

	public static void main(String[] args) {
		/*
		 * for문 이용, 1~100까지의 정수 중 3의 배수의 합
		 * - 1~100까지 반복 for문 한단계한단계 확인
		 * - 3의 배수 합
		 */
		int sum = 0;
		for ( int i =1; i<=100;i++) {
//			System.out.println(i);
			if(i % 3 == 0) {
				
				sum +=i;
//				System.out.println(i);
			}
		}
		System.out.println(sum);
	}

}
