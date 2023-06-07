package ch05;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run =true;
		int stunum= 0;
		int student[] = {};
		int score = 0;
		int[] scoreinput= null;
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1. 학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			String val = scan.nextLine();
			
			if("1".equals(val)) {
				System.out.println("학생수> ");
				String input = scan.nextLine();
				stunum = Integer.parseInt(input);
				
			} else if("2".equals(val)) {
				for(int i=0;i< stunum;i++ ) {
					System.out.println("student["+i+"]: " );
					String input = scan.nextLine();
					score = Integer.parseInt(input);
				for(int j=0;j<stunum;j++) {
					scoreinput[j] = score;
				}
					
				}
				
				
				
				
				
				
				
			} else if("3".equals(val)) {
				
				
				
				
				
				
			} else if("4".equals(val)) {
				
				
				
				
				
				
				
			} else if("5".equals(val)) {
				run = false;
			}
			
			
			
			
			
			
			
		}
		System.out.println("종료");
	}

}
