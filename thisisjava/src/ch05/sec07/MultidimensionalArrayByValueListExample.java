package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = { //이 배열은 값이 두개가 들어있는 배열
				{80,90,96},
				{76, 88}
				
		};
		
		System.out.println("1차원 배열 길이(반의 수): "+scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): "+scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): "+scores[1].length);
		
		System.out.println("scores[0][2]: " + scores[0][2]);//행렬좌표 0번행의 2번열
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		int class1Sum = 0;
		
		
		for(int i=0; i<scores[0].length;i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
		
		int class2Sum = 0;
		for(int i=0; i<scores[1].length;i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + class2Avg); //한방에해보기 몇반이 됐든 알아서 해당 반의 합계와 평균점수를 출력할 수 있게
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0;i<scores.length;i++) {
			totalStudent += scores[i].length; //3 + 2 두번실행
			for(int k=0; k<scores[i].length;k++) {
				totalSum += scores[i][k]; //5번실행 구구단
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체학생 수 :"+totalStudent);
		System.out.println("전체학생 합산 점수: " +totalSum);
		System.out.println("전체 학생의 평균 점수: "+totalAvg);
	}
	

}
