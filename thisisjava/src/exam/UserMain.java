package exam;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1.회원등록 | 2.회원목록 | 3.회원상세 | 4.회원수정 | 5.종료");
			System.out.println("입력] ");
			String input = scan.nextLine();
			
			if("1".equals(input)) {
				System.out.println("[회원등록]");
				System.out.println("아이디: ");
				String id = scan.nextLine();
				System.out.println("비밀번호: ");
				String pwd = scan.nextLine();
				System.out.println("이름: ");
				String name = scan.nextLine();
				
			} else if ("2".equals(input)) {
				System.out.println("[회원목록]");
				System.out.println("번호\t 아이디\t 비밀번호\t 이름");
			} else if("3".equals(input)) {
				System.out.println("[회원상세]");
				System.out.println("아이디: ");
				String id = scan.nextLine();
			} else if("4".equals(input)) {
				System.out.println("[회원수정]");
				System.out.println("아이디: ");
				String id = scan.nextLine();
				System.out.println("비밀번호: ");
				String pwd = scan.nextLine();
				System.out.println("이름: ");
				String name = scan.nextLine();
			}
		}
	}
}