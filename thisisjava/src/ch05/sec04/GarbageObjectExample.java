package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; //바로쓰레기돼서 GC가 사라지게 만드는건아님
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println(hobby); //변수가 사라지는건 아냐
		//메모리 "여행" 주소 100
		
	}

}
