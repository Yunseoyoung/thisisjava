package ch04.sec02;

public class IfElseIfElseExample {

	public static void main(String[] args) { //3개 if 문
		int score = 95;
		System.out.println("시작");
		if(score >=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 A입니다."); //더이상 비교하지 않음 밑에껀 아예 확인도 안함
			
		}
		if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}
		if(score>=90) {
			System.out.println("점수가 90~100입니다.");
			System.out.println("등급은 C입니다."); //더이상 비교하지 않음
		}else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		System.out.println("끝");
	}

}
