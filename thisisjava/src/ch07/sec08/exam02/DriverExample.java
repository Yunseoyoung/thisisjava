package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Bus bus = new Bus();
//		driver.drive(bus);
//		
//		
//		Taxi taxi = new Taxi();
//		driver.drive(taxi);
		
		driver.drive1_1();
		driver.drive(new Bus()); //계속 갈아껴보기 객체 주입
		
		driver.setVehicle(new Taxi());
		driver.trunkOpen(); //버스냐 택시냐에따라 다 각자의 //객체만넣어주면 전부다 다르게 실행
		
		
		
		System.out.println(new Bus() instanceof Vehicle); //버스객체가 비하이클의 인스턴스니? 트루
		System.out.println(new Vehicle() instanceof Vehicle); //비하이클객체가 비하이클의 인스턴스니? 트루
		
	}

}
