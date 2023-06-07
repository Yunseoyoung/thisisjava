package ch06;

import java.util.Scanner;

public class BankApplicationExample {
	Account account = new Account();

	public static void main(String[] args) {
		
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
				sysout
				
			}else if("2".equals(val)) {
				
			}else if("3".equals(val)) {
				
			}else if("4".equals(val)) {
				
			}else if("5".equals(val)) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}

}
