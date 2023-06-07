package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan; //선언 스캐너라는 클래스 타입에 변수명은 scan
		scan= new Scanner(System.in); //변수에 값을 대입 초기화 괄호안은 메서드 비슷한 생성자 값을 넘겨주는거고 출력할때 넣어주면 스캐너가 객체를 생성해서
		//객체로 출력이 돼 변수에 객체가 담겨있어
		
		System.out.print("x 값 입력: "); //출력만
//		String strX = scan.nextLine(); //엔터치는때까지 기다리고 있음 엔터를 치면 그 값이 strX에 담김 nextInt로 해도 상관없음
		int strX = scan.nextInt();
		scan.nextLine();
//		int x = Integer.parseInt(strX); //어떤 이점이 있냐 값을 검증해야돼 문자열 컴마나 점 잇을수있으니까 검증할때 유리 바로 정수로 바꿔버리면 그런거 처리할수없어서
		//문자열롤 담았다가 정수로 바꿈 연산안할거면 또 굳이 바꿀필요없음

		System.out.print("y 값 입력: ");
		String strY = scan.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = strX + y;
		System.out.println("x + y: "+result);
		System.out.println();
		
		boolean flag = true; //깃발 청기올려 깃발은 트루아님 폴스
		while(flag) { //참인동안 계속 반복 무한반복
			System.out.print("입력 문자열: ");
			String data = scan.nextLine();
			
			if(data.equals("q")) { //문자열에서 이퀄즈로 비교함 q랑 같으면 q라고 입력하면
				flag = false; //멈춤 while문 끝남
				
			}
			System.out.println("출력 문자열: " + data);
			System.out.println(); //일단 실행됨 break는 바로 없어지는데 근데 다시 갔을때 어 폴스네 끝났네 섬세한 차이
		}
		System.out.println("종료"); //그래서 얘가 실행됨 실행순서 코드보고 머릿속에 그림이 그려져야함 연습 코드로옮기기도 하고 해야돼서
	}

}
