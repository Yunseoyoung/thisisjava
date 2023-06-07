package ch07.sec02;

public class SmartPhone extends Phone {
	
	public boolean wifi;

	public SmartPhone(String model, String color) {
		super();
		System.out.println("자식생성자");
		this.model = model;
		this.color = color;
		
		
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변겅했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	@Override //annotation
	public void sendVoice(String message) { //오버라이딩 첫줄 같아야  //넓은범위는 괜찮 좁힐수없어
		System.out.println("나: "+message); //오타나면 재정의가 안된
		
		//컴파일러한테 재정의할거야 알려주는 기능
	}
	
	
	public void sendVoice(int message) {
		System.out.println("나: "+message); //오버로딩 
	}
}



