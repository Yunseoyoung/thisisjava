package ch06.sec08.exam01;

public class VarLength {
	int sum(int ... values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	int sum2(int[] values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
			if(i==6) return sum;
			
		}
		return sum;
		
	}
	/*String isPass(int score) {
		if(score >= 60) {
			return "합격";
		} else {
			return "불합격";
		}
	}*/
	
	String isPass(int score) {
		if(score >= 60) {
			
		}
			return "불합격";
		
	}
	void test(int number) {
		if (number>5) return; //실행 중지시키는 목적
		System.out.println(number);
	}
	public static void main(String[] args) {
		VarLength v1 = new VarLength();
		System.out.println(v1.sum(1,2,3,4,5,6,7,8,9,10));
		int[] arr = {1,2,3,4,5,6,7,8,9,10};//디비에서 가져온 값
		System.out.println(v1.sum2(arr));
		System.out.println(v1.isPass(80));
	}


	
}
