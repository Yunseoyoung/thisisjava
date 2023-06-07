package exam;

import java.util.Scanner;

public class Bmi {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double height = 0; //키
		double weight = 0; //몸무게
		double bmi = 0;
		
		System.out.print("키(m) 입력: ");
		height = scan.nextDouble();
		System.out.print("몸무게(kg) 입력: ");
		weight = scan.nextDouble();
			
		// 메서드 호출 및 출력
		System.out.println(bmi(height, weight));
	}
	// 해당 메서드를 작성하시오.
	
	public static String bmi(double height, double weight) {		
		try {
			double bmi = (weight/(height*height/10000));
			if(bmi>=25) {
				return "비만";
			}else if(bmi <25 && bmi >18.5) {
				return "표준";
			}else {
				return "저체중";
			}			
		}catch(Exception e) {
			return "키를 제대로 입력해주세요.";
		}		
	}
	
}

