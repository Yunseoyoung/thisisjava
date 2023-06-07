package ch19.sec06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(//객체를 생성하면서 생성자로 직접넣나 따로 넣나 똑같음
				//경로넣어주면 텍스트 기반파일이니까 객체가 생성돼서 버퍼드에 들어감 경로는 아까 생성한 제이슨파일이있는경로
				//txt로 해도됨
				new FileReader("D:/member.json"/*,Charset.forName("UTF-8")*/)
				
				);
		
		String json = br.readLine();//while안하는이유는 한줄읽어로려고 리드라인 어차피 한줄이니까 한줄읽어오려고
		//캐리지 리턴 한줄을 리턴을한다 담고 //json 찍어보면 문자열로 되어있는데 그걸
		br.close();//클로즈
		
		JSONObject root = new JSONObject(json); //여기 넣어주고 객체임
		//제이슨 객체는 누군가 다른사람이 만들어놓음 걍 객체다 얘가 문자열이 객체로 들어감 제이슨오브젝트타입의 객체가 된다
		
		System.out.println("id: "+root.getString("id"));//중괄호해서 뭐땡땡머 겟하면 리턴
		System.out.println("name: "+root.getString("name"));
		System.out.println("age: "+root.getInt("age"));
		System.out.println("student: "+root.getBoolean("student"));//리턴을해주는그런메서드 제공해주는거고
		//getString 써도 컴파일에러아님 걍 롱밸류 어쩌구 에이지가 스트링이 아니다 인티져로 25정수다 그럼 겟인트로 바꾸면됨
		
		
		
		JSONObject tel = root.getJSONObject("tel");//그 안에 객체가 들ㅇ어있어서 갯스트링으로 가져오면안됨
		//집전화랑 핸드폰전화번호가 같이들어있는객체기때문에 겟제이슨오브젝트 써야함
		//문자열로 가지고와보면 스트링이아니다 제이슨오브젝트다 나옴 아 그럼 오브젝트로 가지고 와야겟구나 하면됨
		System.out.println("home: "+tel.getString("home"));//텔에서 홈이랑 모바일 가져와서 출력
		System.out.println("mobile: "+tel.getString("mobile"));
		
		JSONArray skill = root.getJSONArray("skill");//배열 
		System.out.print("skill: ");
		
		/*for(int i=0; i<skill.length();i++) { //반복
		System.out.print(skill.get(i)+ ", ");
			}*/
		for(Object s : skill) { //부모가 자식으로 자동형변환안되는 그럼 아 오브젝트배열이구나
			//오브젝트 배열로 됨 
			System.out.print(s + ", ");
		}
		
		//렝스라는 메서드가 아니다 ㅇ리가 알고있는건 이거 만든사람이 만든거다 
			//배ㄹ열ㄹ이 렝스아니라고
		}

}
