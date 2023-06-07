package ch05;

public class StringEx {

	public static void main(String[] args) {
		//더하기 연산을 하면 새로운 객체가 만들어짐
		//속도차이 느려
		StringBuffer str = new StringBuffer();
//		String str ="";
		// 시작시간1 잼
		long start = System.currentTimeMillis(); 
//		현재시간을 천분의 1초로 정수로
		//나노타임은 되게 길어 163승
		for (int i=0; i<1000000;i++) {
			str.append(i);
//			str += i; // str = str + i; 결국 문자열로 바뀐다
		}
		// 종료시간2 잼
		// 종료시간 - 시작시간 = 소요시간
		long end = System.currentTimeMillis(); //걸린 소요시간
		System.out.println("소요시간:"+(end-start)); //괄호안넣으면 엔드가 먼저 더해져서
		
	}

}
