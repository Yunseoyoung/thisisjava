package ch06.exam.number2;

import ch06.exam.number20.Account;

public class Itemtest {

	public static void main(String[] args) {
		// 아이템 객체 생성
	    Item storm = new Item("스톰 브레이커", 600);
	    Item gauntlet = new Item("인피니티 건틀렛", 999);
	    Item bow = new Item("호크아이의 활", 50);
	    Item shield = new Item("캡틴아메리카의 방패", 50);
	    
	    // 객체 배열에 아이템 할당
	    Item[] items = { /* 1. 아이템을 배열에 할당하세요. */ 
	    		storm, gauntlet, bow, shield
	    };
	    for(int i=0;i<items.length;i++) {
	    	System.out.println(items[i]);
	    }
	    /* 2. 모든 아이템 정보를 출력하세요. */
	}
	static Account[] account = new Account[100];
}
class Item {
	  // 필드
	  String name;
	  int power;
	  
	  // 생성자
	  public Item(String str, int i) {
	    name = str;
	    power = i;
	  }
	  
	  // 메소드(인스턴스 메소드) - 객체 정보를 문자열로 반환
	  public String toString() {
	    return String.format("Item { name:%s, power: %d }", name, power);
	  }
	}
