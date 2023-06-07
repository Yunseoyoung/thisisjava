package ch06.exam;

import java.util.Scanner;

public class Omok {
    public static void main(String[] args) {
        Player user = new Player("사용자", "O"); //플레이어 유저 객체는 이름은 사용자 돌은 o
        Player computer = new Player("컴퓨터", "X"); //플레이어 컴퓨터 객체는 이름은 컴퓨터 돌은 x
        Board board = new Board(19); //보드 객체
        play(board, user, computer);
        
        
        
        
        
        
        
        Scanner scan = new Scanner(System.in);
    }
    private static void play(Board board, Player user, Player computer) {
        board.print();
    }
}

