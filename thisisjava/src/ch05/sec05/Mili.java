package ch05.sec05;

public class Mili {

	public static void main(String[] args) {
		String fileName = "신한DS1회차.xlsx";
		String fileName2 = "밀리세컨초.xlsx";
		long t = System.currentTimeMillis();
		String str = String.valueOf(t);
	
//		System.out.println(t);
		String newStr = fileName.replace("신한DS1회차", str);
		System.out.println(newStr);
		
		
		fileName.split(".");
	}

}

