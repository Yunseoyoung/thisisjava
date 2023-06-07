package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum = 0;
		System.out.println("배열길이:"+scores.length); //타입이 실제로 인트다 정수
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i);
			sum += scores[i];
		}
//		System.out.println(scores[3]); 3없어서 에러
//		System.out.println("총합 : "+sum);
//		double avg = (double) sum/3;
//		System.out.println("평균 : "+avg);
		printItem(new int[] { 83, 90, 87 });

	}

	public static void printItem(int[] scores) { // 스코어즈 둘이 완전 다른것
		for (int i = 0; i < scores.length; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}

}
