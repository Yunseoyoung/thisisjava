package ch04;

import java.util.Scanner;

public class Excer88 {

	public static void main(String[] args) {
		/*
		 * 숫자 맞히기 게임
		 * 컴퓨터가 1~100사이의 수 정함
		 * 사용자가 그 수를 맞춤
		 * 작은수를 입력했으면 "큰 수를 입력하세요" 출력
		 * 큰수를 입력했으면 "작은수를 입력하세요" 출력
		 * 맞았으면 "맞았습니다. 시도횟수 0회"
		 * 
		 * for : 반복횟수가 정해진 경우
		 * while : 반복횟수가 정해지지 않은 경우
		 * 
		 */
		int comNumber = (int)(Math.random()*100)+1;
		boolean flag = true;
		Scanner scan = new Scanner(System.in); //메서드를 호출했지만 scan을 안써서 자글우글
		int count = 0;
		while(flag) {
//			Scanner scan = new Scanner(System.in); //이렇게 하면 안되는 이유는 객체를 받아야 해서
			//아무런 차이가없음 실행해보면 근데 반복을할때마다 메모리에 계속 뉴 했기때문에 새로운 공간에다가 객체를 새로생성해서 저장함
			//웹개발할때 같이쓰니까 부족할수있는 낭비되는걸 줄이기 나중에 메모리가 부족해지는
			System.out.println("입력>");
			int userNumber = Integer.parseInt(scan.nextLine());
			count++; //시도횟수 출력하는것보다만 앞에 있으면 됨
			if(comNumber > userNumber) {
				System.out.println("큰 수를 입력하세요.");
			}else if(comNumber < userNumber) {
				System.out.println("작은 수를 입력하세요.");
			}else {
				System.out.println("맞았습니다. 시도횟수:"+count+"회");
				flag = false;
			} //3가지 다 별개라 먼저 뭘 하든 상관없다
		}
		
	}

}

