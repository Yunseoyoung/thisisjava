package ch06.exam.number1;

public class Cylinder {
	
	int radius;
	int height;

	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	double getVolume() {
		double volume = radius*radius*3.141592*height;
		return volume;
	}
	double getArea() {
		double area = 2*radius*radius*3.141592 + 2*radius*3.141592*height;
		return area;
	}
	

}
