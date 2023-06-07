package ch02.sec11;

public class VariableScopeExample {
	
	int v4;

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
			int v3 = v1 + v2 + 5;
		}
	}
	void test() {
		System.out.println(v4); //바깥에 있을땐 초기화안해도 되고
		int v5 = 0;
		v5 = 10;
		
		
	}

}
