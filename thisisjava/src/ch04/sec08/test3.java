package ch04.sec08;

public class test3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		sum=0;
		for(int i=3;i<100;i+=3) {
			sum +=i;
		}
		System.out.println(sum);
	}

}
