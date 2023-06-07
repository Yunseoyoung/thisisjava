package ch00.omok;

public class Player {
	String name;
	String stone;
	
	boolean victory = false; //승리하면 true돼서 반복문 빠져나오게 필드 만듬
	
	Player(String name, String stone) {
		this.name = name;
		this.stone = stone;
	}
}