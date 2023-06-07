package ch00.omok;

public class Board {
	int size; //정수 사이즈 선언
	String[][] map; //2차원 배열 선언

	Board(int size){ //Board 생성자
		this.size = size; //size 19 받아온걸 필드에도 넣어줌
		map = new String[size][size]; //빈 2차원 배열 생성
		for(int row = 0; row < size; row++) {
			for(int col = 0; col < size; col++) {
				map[row][col] = "."; //비어있던 2차원 배열에 .을 넣어줌
			}
		}
	}
	public void print() { //Board 클래스의 메서드인 print()
		for(int row = 0; row < size; row++) {
			System.out.printf("%2d", row); //두자리수 간격 맞춰서 찍음 행마다 한개씩 찍어줌
			for(int col = 0; col < size; col++) {
				System.out.print(" " + map[row][col]);
			}
			System.out.println(); //각 행으로 띄워서 프린트
		}
		System.out.print("   "); //점이랑 맞추려고 빈칸으로 띄움
		for(int col = 0; col < size; col++) { //각 열마다 한개씩 A~S까지 찍히게 반복해
			System.out.print((char)(65+col)+" "); //아스키코드 65와 0부터 18까지 더해서 그걸 또 문자로 바꿔줌 
		}
		System.out.println(); //오목에서 사용자 받아오는거 한칸 띄울려고
	}
}