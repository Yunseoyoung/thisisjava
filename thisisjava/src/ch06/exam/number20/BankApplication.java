package ch06.exam.number20;

import java.util.Scanner;

public class BankApplication {
	static int size =0;
	static Account[] account = new Account[100];
	public static void main(String[] args) {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		while(flag) {
			System.out.println("----------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			String input = scan.nextLine();
			
			if("1".equals(input)) {
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				
				System.out.println("계좌번호: ");
				String number = scan.nextLine();
				
				System.out.println("계좌주: ");
				String owner = scan.nextLine();
				
				System.out.println("초기입금액: ");
				int price = Integer.parseInt(scan.nextLine());
				Account acc = searchAccount(number);
				if(acc==null) {
					account[size] = new Account(number
							,owner,price);
					++size;
					System.out.println("결과: 계좌가 생성되었습니다.");
				}else {
					System.out.println("이미 존재하는 계좌번호입니다.");
				}		
				
			}else if("2".equals(input)) {
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				for(int i=0;i<size;i++) {
					System.out.println(account[i].getNumber()+"\t"
				+account[i].getOwner()+"\t"
				+account[i].getBalance());
				}
								
				
			}else if("3".equals(input)) {
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				System.out.println("계좌번호: ");
				String number = scan.nextLine();
				System.out.println("예금액: ");
				int price = Integer.parseInt(scan.nextLine());
				Account acc = searchAccount(number);
				if(acc == null) {
					System.out.println("존재하지 않는 계좌번호입니다.");
				}else {
					acc.setBalance(acc.getBalance()+price);
				}
				
				
			}else if("4".equals(input)) {
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				System.out.println("계좌번호: ");
				String number = scan.nextLine();
				System.out.println("출금액: ");
				int price = Integer.parseInt(scan.nextLine());
				Account acc = searchAccount(number);
				if(acc == null) {
					System.out.println("존재하지 않는 계좌번호입니다.");
				}else {
					acc.setBalance(acc.getBalance()+price);
				}
				
			}else if("5".equals(input)) {
				System.out.println("프로그램 종료");
				flag = false;
			}
		}
		
	}
	
	
	static Account searchAccount(String number) {
		for (int i=0;i<size;i++) {
			if(number.equals(account[i].getNumber())) {
				return account[i];
			}
		}
		return null;
			
	}

}
