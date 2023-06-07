package ch06.exam;

public class Player {
    String name; //이름 필드
    String stone; // 바둑 필드
    Player(String name, String stone) { //플레이어 생성자
        this.name = name; //필드 이름 = 변수 이름
        this.stone = stone; //필드 돌 = 변수 돌
    }
}