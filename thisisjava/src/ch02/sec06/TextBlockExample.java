package ch02.sec06;

import ch01.verify.Example;

public class TextBlockExample {

	public static void main(String[] args) {
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" + 
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		
		System.out.println(str1);
		System.out.println("--------------------------");
		
		//자동으로 돼서 타입추론 jdk 11부터 가능한
		var a = 1;
		var b = ""; //아무거나 다 올 수 있어
		
//		Example e = new Example();
		var e = new Example();
		
		int i = 1;
		long l = i; //작은거를 큰거로 넣는건돼 //자동형변환
//		int i2 = l; //큰거를 작은거에 담으려고하면 에러 //담을수있는만큼만 담겨짐
		int i2 = (int)l; //강제형변환
		
		double d = 3.14;
		int d2 = (int)d;
		System.out.println(d2); //int에 담을 수 있는것만 소수점 유실
		
		// 정수와 정수의 연산은 결과값이 항상 정수
		int kor = 90;
		int eng = 80;
		int math = 87;
		int total = kor + eng + math;
		double avg = total / 3.0;
		double avg2 = (double)total / 3.0; //애초에 정수이기 때문에 실수로 강제형변환 
		System.out.println(avg); //85점 몇 나와야함 =이콜 기준으로 오른쪽먼저라 257에서 먼저 3을 나눠 그럼 소수점으로 안나오고 정수로 나옴
		System.out.println(avg2); //85점 몇 나와야함 =이콜 기준으로 오른쪽먼저라 257에서 먼저 3을 나눠 그럼 소수점으로 안나오고 정수로 나옴
		System.out.println(avg2); //85점 몇 나와야함 =이콜 기준으로 오른쪽먼저라 257에서 먼저 3을 나눠 그럼 소수점으로 안나오고 정수로 나옴
		
//		85를 더블로 담으니까 85.0이 된거다
//		정수와 정수연산이 안되게 바꿔버려
		
		
		
		
	}

}
