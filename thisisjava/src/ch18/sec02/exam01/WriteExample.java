package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			OutputStream os = new FileOutputStream("D:/java/abc.db");
			//스트림 기반의 파일을 읽어드려서
			byte a = 10;
			
			byte b = 20;
			byte c = 30;
			
			for(int i=0; i<100;i++) {
				os.write(i);
			}
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
					
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
