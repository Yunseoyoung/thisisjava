package ch05;

public class test7 {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int max = 0;
		for(int i=0;i<array.length;i++) {
			System.out.println("현재값"+array[i]);
			
			
			if(max< array[i]) { //크면 대입
				max = array[i];
			}
			
			System.out.println("max="+max);
			System.out.println();
		}
	}

}
