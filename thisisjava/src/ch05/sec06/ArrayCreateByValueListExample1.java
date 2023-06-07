package ch05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		String [] season = {"Spring","Summer","Fall","Winter"};
		for(int i=0;i<season.length;i++) {
			System.out.println("season["+i+"]:"+season[i]);
		}
		
//		System.out.println("season[0]: " +season[0]);
//		System.out.println("season[1]: " +season[1]);
//		System.out.println("season[2]: " +season[2]);
//		System.out.println("season[3]: " +season[3]);
		
		season[1] = "여름";
		System.out.println("season[1] : "+season[1]);
		System.out.println();
		
		int[] scores = {83,90,87};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.println(i);
			sum +=scores[i];
		}
//		System.out.println(scores[3]); 3없어서 에러
		System.out.println("총합 : "+sum);
		double avg = (double) sum/3;
		System.out.println("평균 : "+avg);
		
//		ArrayCreateByValuesListExample[] array; 길어도 배열쓴느법또같아
	}

}
