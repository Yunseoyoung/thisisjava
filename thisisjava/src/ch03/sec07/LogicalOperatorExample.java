package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';
		
		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요.");
		}
		
		if( (97<=charCode) && (charCode<=122) ) {
			System.out.println("소문자이군요.");
		}
		
		if( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		//---------------------------------------
		
		int value = 6;
		//int value = 7;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		boolean result = (value%2==0) || (value%3==0); //트루 폴스 대입연산은 맨 마지막에
		if (!result) {
			System.out.println("2 또는 3의 배수가 아니군요."); //폴스일때 실행
		}
		
		// &&와 &의 차이 (||와 |) -> shortcut 짧게 자른다 더이상 뒤에거 할필요가 없다
		String a = null;
		if (3 == 3 || a.equals("admin")) { //null.equals는 에러
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (a != null && a.equals("admin")) {
			
		}
		
	}

}
