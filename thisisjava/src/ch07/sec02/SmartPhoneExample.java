package ch07.sec02;

import java.util.Date;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델: "+myPhone.model);
		System.out.println("색상: "+myPhone.color);
		System.out.println("와이파이 상태: "+myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.sendVoice(1);
		
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
		
		Phone p =myPhone;//자동형변환
		
//		p.internet();
		
		//자식에서 재정의된 메서드는 됨
		p.sendVoice("안녕");
		
		Phone p2 = new Phone();
//		SmartPhone c2 = (SmartPhone)p2;
		//좁은범위 = 넓은 범위는 에러 
		//강제형변환
		//런타임에러 클래스캐스트익셉션 캐스팅하다가 예외발생
//		
		SmartPhone c2 = (SmartPhone)p;//얘는됨
		
		//강제형변환의 조건: 자식-> 부모형변환된 객체만 가능 그럴때는 다시 자식으로 바껴지지만
		//자식이었는데 부모로 형변환된놈만 다시원상태로 돌아가
		
		Object obj =new Phone();
		Object obj2 = new SmartPhone("갤럭시","은색");
		Object obj3 = new SmartPhoneExample(); //형변환가능
		
//		다형성(타입이 달라져 -> 실행코드는 하나지만 결과가 달라지는)
		Phone[] objArr = {myPhone, p, p2, c2}; //p2는 재정의된 메서드가 실행되고있는
		for(int i=0;i<objArr.length;i++) {
			objArr[i].sendVoice("안녕");
		} //재정의를 다 다르게했으면 자식들이 모두다 다르게 나와
		
		((SmartPhone)obj2).sendVoice("안녕"); //대입을해야 형변환 ㅇ여기선 여기에서만
		
		System.out.println(obj2.toString());
		
		Date d = new Date();  //?
		System.out.println(d);

	}//부모자식 재정의 다르게 결과다르게 상황따라

}
