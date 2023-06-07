package ch06.exam;

public class Board {
    int size; //필드 사이즈
    String[][] map; //필드 맵 2차원 배열 문자열?
    Board(int size) { //보드 생성자
        this.size = size; //필드 사이즈는 변수 사이즈 여기에 19를 넣음
        map = new String[size][size]; //19행 19열
        for (int row = 0; row < size; row++) { //19행동안
        	
            for (int col = 0; col < size; col++) { //19열
            	
                map[row][col] = "."; //. 찍기
            }
        }
    }
    public void print() {
        for (int row = 0; row < size; row++) {
  
        	System.out.printf("%2d",row); // 좌측에 좌표 출력 0, 1, 2, 3, … , 18 
        	//대문자 A는 65부터
            for (int col = 0; col < size; col++) {
            	
                System.out.print(" " + map[row][col]); //.보다 이게먼저네? 
                
            }
            System.out.println();
            
                       
            
        }System.out.print("  "); //띄어쓰기
        for(int i=0; i<size;i++) { //ABCD~S까지 출력
			System.out.print(" "+(char)('A' +i));
		}
    }
}