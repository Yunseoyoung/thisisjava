package ch06;

import java.util.Scanner;

public class BankApplication {
	


	public static void main(String[] args) {
		Account[] account = new Account[100];
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");
			String val = scan.nextLine();
			
			if("1".equals(val)) {
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				
				System.out.println("계좌번호: ");
				int Account.account = Integer.parseInt(scan.nextLine());
				System.out.println("계좌주: ");
				int account. = Integer.parseInt(scan.nextLine());
				System.out.println("초기입금액: ");
				int account. = Integer.parseInt(scan.nextLine());
				System.out.println("결과: 계좌가 생성되었습니다.");
				
			}else if("2".equals(val)) {
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				
			}else if("3".equals(val)) {
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				System.out.println("계좌번호: "+);
				int = Integer.parseInt(scan.nextLine());
				
			}else if("4".equals(val)) {
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				System.out.println("계좌번호: "+ );
				
			}else if("5".equals(val)) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
