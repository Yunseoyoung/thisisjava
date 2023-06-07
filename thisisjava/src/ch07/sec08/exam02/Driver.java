package ch07.sec08.exam02;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	public void drive1() {
		System.out.println("차량이");
	}
	public void drive1_1() {
		System.out.println("차량이2");
	}
	public void drive2() {
		System.out.println("버스가");
	}
	public void drive3() {
		System.out.println("택시가");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Vehicle v; //객체선언 //트럭으로 해놓으면 트럭밖에 못씀 의존적 그래서 비하이클로하고 외부에서
	//객체를 주입 
	// (Dependency Injection) DI 주입하다 바깥에서 의존성을 넣어줌 스프링 개념
	public void setVehicle(Vehicle v) {
		this.v = v;
	}
	public void run1() {
		v.run();
	}
	public void back() {
		v.run();
	}
	
	public void trunkOpen() {
		v.run();
	}
	
	public void openDoor() {
		v.run();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
