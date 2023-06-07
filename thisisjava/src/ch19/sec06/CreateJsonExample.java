package ch19.sec06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject root = new JSONObject();
		
		root.put("id","winter");
		root.put("name","한겨울");
		root.put("age",25);
		root.put("student",true);
		
		JSONObject tel = new JSONObject();//별도의 텔이라는 객체
		tel.put("home", "02-123-1234"); //만듬
		tel.put("mobile", "010-123-1234");
		root.put("tel", tel); //루트에다가 텔객체를 텔이라는 속성명으로 넣음
		
		JSONArray skill = new JSONArray(); //배열 세개의 값이 들어있음 배열 내부적으로 처리했을것
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill",skill);
		
		
		String json = root.toString(); //재정의 객체는 중괄 배열은 대괄호 컴마컴마묶어서 json에 담아줌
		//전송할때 한줄로 네트워크 전송할때 빠름 줄바꿈하든말든안해도됨 컴터는ㄱㅊ
		
		System.out.println(json);
		
		Writer writer = new FileWriter("D:/member.json",Charset.forName("UTF-8"));
		writer.write(json);//파일라이터 문자를통째로 
		writer.flush();
		writer.close();
		

	}

}
