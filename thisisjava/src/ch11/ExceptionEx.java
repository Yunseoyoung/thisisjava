package ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("java.lang.String"); //중단된게아니라 메인메서드가 끝나서 나온거고
		try(
			 FileInputStream fis = new FileInputStream("D:\\madang.dmp"); //파일경로가없어서
		){
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		FileInputStream fis = null; //파일낫파운드 익셉션 실제 에러 난 부분 여러개
		try {
			Class.forName("java.lang.String");
			fis = new FileInputStream("");
		}catch(Exception e) {
//			e.printStackTrace();
		} finally {
//			fis.close(); //에러남 이미 선언돼서 선언됐기때문에 트라이 중괄호블럭에서만 쓸수있다
			
			try {fis.close();}catch(Exception e) {}
		}
		
		// TODO Auto-generated method stub
		System.out.println("시작");
		try {
			System.out.println(3/0);
			int[] arr = {1,2,3};
			System.out.println(arr[3]);//예외발생
			System.out.println("출력");
			
		} catch (Exception e) {
			
			System.out.println("예외발생"); //그 어떤 예외도 다 잡아냄
			//넓은놈 밑에 써야함 안잡히고 안잡히고 잡히게 규칙
//			System.out.println(e.getMessage());
//			System.out.println(e.toString()); 로그보는법
//			e.printStackTrace();
		} finally {
			// 예외가 발생하던 안하던 무조건 실행
			System.out.println("무조건실행");
			try {
//				file.close(); //예외를 떤짐 //예외가 아니라 신택스 에러라 에러 변수가없어서
			} catch (Exception e) {}
//			file.close(); //예외를 떤짐
		}
		System.out.println("무조건실행");
		/*}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
		System.out.println("끝");*/
		

	}

}
