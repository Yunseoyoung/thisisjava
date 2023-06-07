package ch04;

import java.util.Scanner;

public class Excer8 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
		int i = 1;
		while(run) {
			
			
			
			System.out.print("숫자입력>");
			

			String val = scan.nextLine(); //여기선에러안남
			
			
			

			int inputInt = Integer.parseInt(val);
//			String val = scan.nextLine(); 변수를 쓰고 있어서 에러
			
			if(num == inputInt) {
				System.out.println("맞았습니다. 시도횟수"+i+"회");
				run = false;
				
			} else if (num>inputInt) {
				System.out.println("큰 수를 입력하세요");
			} else if (num < inputInt) {
				System.out.println("작은 수를 입력하세요");
			}
			i++;
			
		}
		System.out.println("프로그램 종료");
		
		
	
		
		
	}

}
