package ch13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Member(); //객체만 들어갔고
//		o.login(); //오브젝트에 정의되지 않았다
		o.toString(); //오브젝트에 있음
		
		Member m = (Member)o; //형변환 //변수를 가리키는 주소는 똑같고 타입만 달라지는
		
//		Member o1 = new Member();
		m.login();
		o = new Admin();
		Admin a = (Admin)o;
		a.manage();
		
		Member[] mArr = {new Member(), new Member(), new Member()};
		Admin[] aArr = {new Admin(), new Admin(), new Admin()};
		//같은데이터가 나온다 이미 알고있다
		//
		
		print(mArr);
		print(aArr);
		
		// ArrayList 배열목록 클래스 컬렉션프레임워크중하나
//		ArrayList<Member> al = new ArrayList<Member>(); //난 멤버만 쓸것
//		List<Member> al = new ArrayList<Member>(); //인터페이스를 구현한 구현클래스가 어레이리스트
		List<Member> al1 = new Vector<Member>(); //똑같은걸 재정의
		Vector<Member> ab = new Vector<Member>(); //똑같은걸 재정의
//		List<Member> al = new ArrayList<>();
		var al = new ArrayList<Member>(); //컴파일러가 타입을 추론해서 이 타입으로 만들어준다 11이상부터
		
		ab.addElement(new Member());
		al.add(new Member());
		al.add(new Member());
		al.add(new Member());
		al.add(new Member()); //자동형변환
		
//		al.add(new Member());
//		al.add(new Admin());
//		al.add(new Member());
//		al.add(new Admin());
//		al.add(1);
//		al.add("1");
		System.out.println(al.size());
		
		for (int i=0; i<al.size();i++) {
//			Member m2 = (Member)al.get(i); //강제형변환 자식
//			System.out.println(((Member)al.get(i)).login());
			System.out.println(al.get(i).login());
		}
		
//		Map<String, Member> map = new HashMap<String, Member>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("2", 4); //걍 바꿔져버리는 어떤 키가있는지 모르는 키만 쏙 뽑아와
//		System.out.println(map.get("3").login());
	}
	
	public static void print(Member[] m) {
		//화면에 출력
	}
	public static void print(Admin[] m) {
		//화면에 출력
	}
}
