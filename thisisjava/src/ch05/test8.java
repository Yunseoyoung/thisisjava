package ch05;

public class test8 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88} //나중에 값이 안보이고 해야될수있음
				//그림그리기
		};
		int total = 0;
		int count = 0;
		
		/*for(int[] arr : array) {
			for (int a : arr) {
				total+=a;
				count++;
			}
		}*/ //향상된 포문
		
		for (int i=0; i<array.length;i++) {
//			System.out.println(i);
			int[] arr = array[i]; //하나의 배열이다
//			System.out.println(array[i].length);
			for(int j=0;j<arr.length;j++) {
//				System.out.println(arr[j]);
				total += arr[j];
				count++; //포문이 다돌면 개수가 되는거다
			}
		}
		System.out.println(total);
		System.out.println(count);
		System.out.println((double)total/count);
//		int count = 0;
//		int sum = 0;
		
		
//		for(int i=0;i<array.length;i++) {
//			count += array[i].length;
//			for(int j=0; j<array[i].length;j++) {
//				sum += array[i][j];
				
//			}
//		}
//		double avg = (double) sum/count;
//		System.out.println("수: " +count);
//		System.out.println("합: " +sum);
//		System.out.println("평균: " +avg);
	}

}
