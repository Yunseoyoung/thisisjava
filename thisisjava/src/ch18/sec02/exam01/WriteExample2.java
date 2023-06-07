package ch18.sec02.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Writer os = new FileWriter("D:/java/abc.txt");
			//스트림 기반의 파일을 읽어드려서
//			byte a = 10; //열어봐야안보임
//			
//			byte b = 20;
//			byte c = 30;
			
			for(int i=65; i<91;i++) {
				os.write((char)i);
			}
			os.write("\n");
			os.write("안녕하세요");
			
//			os.write(a);
//			os.write(b);
//			os.write(c);
			
			os.flush();
			os.close();
					
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
