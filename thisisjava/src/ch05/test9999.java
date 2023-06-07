package ch05;

import java.util.Scanner;

public class test9999 {
	
	
	

	public static void main(String[] args) {
		int[] scores =null;
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			String val = scan.nextLine();
			if("1".equals(val)) {
				System.out.println("학생수> ");
				int count = Integer.parseInt(scan.nextLine());
				scores = new int[count];
				
			}else if("2".equals(val)) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]> ");
					int score = Integer.parseInt(scan.nextLine());
					scores[i] =score;
				}
				
				
			}else if("3".equals(val)) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
					
					
				}
				
			}else if("4".equals(val)) {
				int max=0;
				int sum = 0;
				for(int i=0;i<scores.length;i++) {
					
					if(max<scores[i]) {
						max = scores[i];
						
					}
					sum = sum + scores[i];
				}
				System.out.println("최고점수"+max);
				System.out.println("평균"+(double)sum/scores.length);
				
				
			}else if("5".equals(val)) {
				System.out.println("종료");
				break;
			}
		}
		
		
	}

}
