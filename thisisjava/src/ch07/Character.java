package ch07;

public class Character {
	String name;
	int hp;
	int ap;
	
	Character(String name, int hp, int ap){
		this.name = name;
		this.hp = hp;
		this.ap = ap;
	}
	
	void attack(Character c) {
		System.out.println(this.name+"가 "+c.name+"를공격");
		c.hp = c.hp - this.ap < 0 ? 0 : c.hp - this.ap;
	}
}
