package ch04;

public class Excer4 {

	public static void main(String[] args) {
		/*
		 * while, Math.random() 사용
		 * 반복 주사위 눈 2개 구하기
		 * 두 개의 주사위 (눈1, 눈2) 출력
		 * 눈의 합이 5가 아니면 계속 던지기
		 * 눈의 합이 5이면 멈춤
		 */
		boolean flag = true;
		while (flag) {
			int dice1 = (int)(Math.random()*6)+1; //별개의 독립적 주사위
			int dice2 = (int)(Math.random()*6)+1;
			System.out.println("("+dice1+","+dice2+")");
			/*if (dice1 + dice2 !=5) {
				
			}else {
				flag = false;
			}*/
			if (dice1 + dice2 ==5) {
				flag=false; //브레이크완 다르게 경우의 수가 발생해도 실행이된다 조건에서 비교
//				break; 바로 중지
			}
			
		}
	
	}

}
