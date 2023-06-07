package ch06.exam.number1;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		
		c.radius = 4;
		c.height = 5;
		
		System.out.printf("원기둥의 부피: %.2f\n", c.getVolume()); //println 은 왜 안되나요?
		System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
	}

}
