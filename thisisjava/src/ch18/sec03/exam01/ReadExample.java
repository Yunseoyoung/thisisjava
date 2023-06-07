package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream("D:/java/abc.db"); //수정할건 이쪽밖에없다
			//경로만건들이면 다 읽어올수있다
			//부모 상관없다
			//스트림 기반의 파일을 읽어드려서
			
			int data =0;
			while((data=is.read()) != -1) {
				System.out.println(data);
			}//보통 이렇게 씀
			//담아서 비교하면 멈춰 아니면돼 아니면 도는거
			//-1이면 실행안함
			
//			while(true) {
//				int data = is.read(); //한바이트 읽어와서 담고
//				if(data == -1) break; //정수값이 -1이면 중지를하고
//				System.out.println(data); //계속출력출력
//			}
//			
			is.close(); 
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
