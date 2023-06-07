package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 1000;
		char grade = score > 90 ? 'A' :  score > 80 ? 'B' : 'C' ;
		//조건이 트루면 대입이되는거야 폴스면 콜론 뒤에가 실행됨 또 다른 삼항연산 조건이 트루면은 트루라 B대입됨 구분하자
		System.out.println(score + "점은" + grade + "등급입니다.");
		
		// 
		System.out.println("당신은 '"+(score>=60?"합격":"불합격")+"'입니다."); //장점
		
		int value = 356;
		System.out.println(value-value%100);
		System.out.println(value/100*100); //정수라 백의 자리만 나오고 그담 곱하면 됨
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom)*height*1.0/2;
		System.out.println(area);
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
				
	}

}
