package ch07;

public class GreatWizard extends Wizard {
	GreatWizard(String name, int hp, int ap){
		super(name, hp+30, ap+50);
	}
	
	//메서드 재정의
	
	@Override
	void attack(Character c) {
		System.out.println(this.name+"가 "+c.name+"를공격");
		c.hp = c.hp - this.ap < 0 ? 0 : c.hp - this.ap;
	}
}
