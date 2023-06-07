package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			toolkit.beep(); //소리내는코드
			try { Thread.sleep(500); //스테틱 슬립메서드 호출 트라이안쓰면 에러 언핸들드 인터럽티드익셉션
			//자는거 재우는거 밀ㄹ리세컨트 0.5초동안 자는거 돌다가 자고 돌다가 자고 인터럽티드가 중지할때 오류날수도있음
			//받아주거나 쓰로우즈하거나
			}catch (Exception e) {} 
		} //메인스레드
		for(int i=0; i<5;i++) {
			System.out.println("띵");
			try { Thread.sleep(500);
			}catch (Exception e) {}
		} //별도의 스레드
	}

}

