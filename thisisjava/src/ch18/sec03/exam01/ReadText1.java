package ch18.sec03.exam01;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText1 {
	
	public static void main(String[] args) {

		try {
			File file = new File("D:/java/abc.txt");
			FileReader fr = new FileReader(file);
			int singleCh = 0;
			while((singleCh = fr.read()) != -1)  // 반환 값이 -1이면 파일 끝에 도달한 것임
				System.out.print((char)singleCh);
			
			fr.close();
			
		} catch (FileNotFoundException e) {  // 파일이 존재하지 않을 때 예외처리
			e.getMessage();
		} catch (IOException e) {  // read메서드의 경우 읽어 올 텍스트가 없을 때 예외처리
			e.getMessage();
		}
		
		
	}
	
}