package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		String board ="1 자바 학습 참조 타입 String을 학습합니다. 홍길동";
		
		String[] tokens = board.split(" "); //배열 담을수있는값은 무조건 이타입 스트링 배열
		
		System.out.println("번호: "+tokens[0]);
		System.out.println("제목: "+tokens[1]);
		System.out.println("내용: "+tokens[2]);
		System.out.println("성명: "+tokens[3]);
		System.out.println();
		
		for(int i=0;i<tokens.length;i++) {
			System.out.println(tokens[i]);
		} //배열은 짝꿍 포문과
		
		
		
		int a =1;
		String b = a+"*";
		System.out.println(b);
	} 

}
