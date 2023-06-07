package ch00.omok;

import java.util.Scanner;

public class Omok {
	static int x; //현재 x좌표 필드
	static int y; //현재 y좌표 필드
	
	public static void main(String[] args) { 
		Player user = new Player("사용자", "O");
		Player computer = new Player("컴퓨터", "X");
		Board board = new Board(19);
		
		play(board, user, computer);
	}
	
	//게임을 진행하는 함수
	private static void play(Board board, Player user, Player computer) {
		boolean run = true; //첫번째 와일문
		//게임 중일때는 true이므로 무한으로 돌아가고 오목이 된 경우에는 false해서 나온다.
		while(run) { //첫번째 와일문
			putStone(board, user); //보드판을 넣고 사용자 넣고
			if(user.victory) break; //유저가 이기면 victory가 true인데 맞으면 while문 나와 그럼 오목 끝남
			putStone(board, computer); //보드판을 넣고 컴퓨터 넣고
			if(computer.victory) break;
		}
	}
	//플레이어에 맞는 돌을 놓는 함수
	public static void putStone(Board board, Player player) {
		Scanner scan = new Scanner(System.in);
		boolean run = true; //두번째 와일문 
		
		while(run) {
			board.print(); //입력받을 때 보드판을 출력해
			System.out.print(player.name+"> ");
			String user = scan.nextLine(); //한 줄 j 9 받음
			//공백 없이 입력되면 다시 입력 받게하기			
			if(user.contains(" ")) {
				String[] input = user.split(" ");
				x = input[0].toUpperCase().charAt(0) - 'A'; //소문자 오면 대문자로 변환 
				y = Integer.parseInt(input[1]);
				//범위 밖으로 입력을 하면 다시 입력 받기
				if(0<=x && x<19 && 0<=y && y<19) {
					if(board.map[y][x].contains(".")) { //점이 찍혀있으면
						board.map[y][x] = player.stone;

						run = false; //알맞은 입력으로 출력했으니까 while문 빠져 나오기
					}else {
						System.out.println("이미 놓은 곳입니다!!!"); //점이 아닌 곳에 놨을 때
					}
					
				}else {
					System.out.println("보드 범위 밖으로는 돌을 놓을 수 없습니다!");
				}
				
			//이미 놓은 곳인지 확인하기	
			}else {
				System.out.println("공백을 넣어 입력해주세요!!!");
			}
		}
		//놓았을때 오목인지 확인하기!(중요)
		if(checkOmok(board, player)) {
			player.victory = true;
			board.print(); //이긴 결과 출력
			System.out.println("-----------------" + player.name + "가 이겼습니다!-----------------");
		}
		
	}
	// 오목이 완성되었는지 확인하는 함수
	public static boolean checkOmok(Board board, Player player) {
		int cnt = 0; //오목되는 횟수 선언
		
		//세로 확인하기
		for(int i = 0; i <= 8; i++) {
			int indexX = x;
			int indexY = y-4+i;
			
			if(0<=indexX && indexX<19 && 0<=indexY && indexY<19) {
				if(player.stone.equals(board.map[indexY][indexX])) {
					cnt++;
					
					
 				}else {
					cnt = 0;
				}
				if(cnt == 5) return true;
				
			}
			
		}

		//가로 확인하기
		for(int i = 0; i <= 8; i++) {
			int indexX = x-4+i;
			int indexY = y;
			
			if(0<=indexX && indexX<19 && 0<=indexY && indexY<19) {
				if(player.stone.equals(board.map[indexY][indexX])) {
					cnt++;
					
					
 				}else {
					cnt = 0;
				}
				if(cnt == 5) return true;
			}
			
		}
		// \역대각\ , 왼쪽 위부터 시작
		for(int i = 0; i <= 8; i++) {
			int indexX = x-4+i;
			int indexY = y-4+i;
			
			if(0<=indexX && indexX<19 && 0<=indexY && indexY<19) {
				if(player.stone.equals(board.map[indexY][indexX])) {
					cnt++;
					
					
 				}else {
					cnt = 0;
				}
				if(cnt == 5) return true;
				
			}
			
		}
		// /대각/ 왼쪽 아래부터 시작
		for(int i = 0; i <= 8; i++) {
			int indexX = x-4+i;
			int indexY = y+4-i;
			
			if(0<=indexX && indexX<19 && 0<=indexY && indexY<19) {
				if(player.stone.equals(board.map[indexY][indexX])) {
					cnt++;
					
					
 				}else {
					cnt = 0;
				}
				if(cnt == 5) return true;
				
			}
			
		}
		return false; //폴스니까 빅토리가 아니다
	}	
}