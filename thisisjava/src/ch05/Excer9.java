package ch05;

import java.util.Scanner;

public class Excer9 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in); //객체를 생성하는 행위도 리소스잡아먹음
//		int[] scores =new int[0]; //해놓고 새로운객체를 생성하는것 처음에만 선언
		int[] scores = null;
		while(true) {
			System.out.println("------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------");
			System.out.print("선택>");
			String val = scan.nextLine();
//			System.out.println(val);
//			int[] scores = null; //초기화
			
			if ("1".equals(val)) {
				System.out.print("학생수>");
				int count = Integer.parseInt(scan.nextLine());
				scores = new int[count]; //객체가 바뀐다
//				System.out.println(scores.length);
//				int[] scores = new int[count]; //입력한 개수만큼 배열생성 값이 중요한게 아니다
			} else if ("2".equals(val)) {
				if(scores == null) {
					System.out.println("학생수를 먼저 입력하세요");
//					continue;
				} else {
					for(int i =0;i<scores.length;i++) {
						System.out.println("scores["+i+"]>");
						int score = Integer.parseInt(scan.nextLine());
						scores[i] = score; //배열에 대입 렝스만큼
					}
				}
				
			} else if ("3".equals(val)) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			} else if ("4".equals(val)) {
				int max = 0;
				int sum = 0;
				for (int i=0;i<scores.length;i++) {
					if(max < scores[i]) max = scores[i];
					sum+= scores[i];
				}
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+(double)sum/scores.length);
			} else if ("5".equals(val)) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
