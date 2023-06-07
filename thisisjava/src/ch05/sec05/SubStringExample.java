package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		//한문자씩 출력
		
		
		String thirdNum = ssn.substring(0,1);
		for(int j=0;j<=13;j++) {
			String FourthNum = ssn.substring(j,j+1);
			System.out.println(FourthNum);
		}
//		String FourthNum = ssn.substring(i,1);
		System.out.println(thirdNum);
		
		
		for(int i=0;i<ssn.length() ;i++) {
			System.out.println(ssn.charAt(i));
		}
//		long t = System.currentTimeMillis();//천분의 일초로 계le
//		int idx = fileName.indexOf(".");
//		String ext = fileName.substring(idx);
//		String fileName2 = System.currentTimeMillis()+ext;
//		System.out.println(fileName2);
		
//		String fileName3 = System.currentTimeMillis() + fileName.substring(fileName.indexOf(".")); 세줄과 한줄이 같은거
		
		String fileName = "내사진.jpg"; //123.jpg
		// 확장자 구하기
		String ext = fileName.substring(fileName.indexOf("."));
		System.out.println(ext);
		String fileName2 = System.currentTimeMillis()+ext;
		System.out.println(fileName2);
//		int idx = fileName.lastIndexOf("."); 뒤에서부터찾기
	}

}
