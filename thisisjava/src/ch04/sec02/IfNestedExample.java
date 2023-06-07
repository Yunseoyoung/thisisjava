package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81; //81부터 19까지니까 100점최고
		System.out.println("점수: "+score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
//				String grade1; 블럭이 달라져서
				grade = "A+";
				
			}else { //90 91 92 93 94
				grade = "A";
			}
		}else {
			if(score>=85) {
				grade = "B+";
				
			}else { //81 이상 85미만
				grade = "B";
			}
		}
		System.out.println("학점: " +grade);
	}

}
