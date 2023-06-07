package ch09.sec07.exam01;

@FunctionalInterface //추상메서드 두개쓰려하면 에러남 하나만 쓸수있게 하는것 표시만 체크할수있게
public interface Tire {
	void roll(); //추상메서드 없지만 있는거 
	//public abstract void roll();
}

