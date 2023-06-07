package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();//머릿속에 추상화꼭해보기 객체생성해놓고
		//객체생성되면서 생성자가 실행이되는것 실행됨과 동시에
		//메모리에담기고 참조하는거
		Car yourCar = new Car("k7","흰색",250);//머릿속에 추상화꼭해보기 객체생성해놓고
		//다른주소
		Car otherCar = new Car(); //왜자동으로안나오지 //컨트롤 스페이스바
		
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
		System.out.println("수정된 속도: "+yourCar.maxSpeed);
		System.out.println("myCar 색상: "+yourCar.color); //넘겨주기만하는거지 바뀌징낳아
	}

}
