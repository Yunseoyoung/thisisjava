package ch04.sec08;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		int total = 0;
		
		
		while(run) {
			System.out.println("----------------------------");
			
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			String strNum = scan.nextLine();
			
			if(strNum.equals("1")) {
				System.out.print("예금액> ");
				String strMoney = scan.nextLine();
				int money = Integer.parseInt(strMoney);
				total = total + money;
				
			}else if(strNum.equals("2")) {
				System.out.print("출금액> ");
				String strwithdraw = scan.nextLine();
				int withdraw = Integer.parseInt(strwithdraw);
				if(total>= withdraw) {
					total = total - withdraw;
				}else {
					System.out.println("잔고가 부족하여 출금하지 못합니다.");
				}
				
				
			}else if(strNum.equals("3")) {
				System.out.print("잔고> " + total);
				System.out.println();
//				String strtotal = scan.nextLine(); 이거 지역변수넣는거 좀 헷갈리네
				
				
			}else if(strNum.equals("4")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

}



