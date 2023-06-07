package ch04;

import java.util.Scanner;

public class Excer7 {

	public static void main(String[] args) {
		/*
		 * while 무한 반복
		 * 기능 종류 입력
		 * 1이면 입력, 잔고+
		 * 2이면 입력, 잔고-
		 * 3이면 잔고 출력
		 * 4이면 종료
		 */
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int account = 0;
		while(run) {
			System.out.println("-----------------");
			
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------");
			System.out.print("선택>");
			
			String val = scan.nextLine();
//			System.out.println(val);
//			int val = scan.nextInt(); //a 쓰면 에러 굳이 정수로 연산할거아니니까  넥인하면 에러나는거아녓음?
			if("1".equals(val)) {
				System.out.println("예금액>");
				String input = scan.nextLine(); //문자열 연산한 결과를 담을수없다 에러
				account = account +Integer.parseInt(input);
			} else if ("2".equals(val)) {
				System.out.println("출금액>");
				String input = scan.nextLine(); //문자열 연산한 결과를 담을수없다 에러
				int inputInt = Integer.parseInt(input); //매번정수로안바꾸게
				if(account < inputInt) {
					System.out.println(account+"이하로만 출금 가능");
				} else {
					account = account - Integer.parseInt(input);
				}
				
				
			} else if ("3".equals(val)) {
				System.out.println("잔고>"+account);
				
			} else if ("4".equals(val)) {
				run = false;
		}
	}
		System.out.println("프로그램 종료"); //와일문끝나고 원래실행문으로 돌아가 엘스이프 4번에 써도 상관없음

}}
