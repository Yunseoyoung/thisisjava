package ch15.sec04.exam01;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>(); //대부분 다 해시맵 밸류 값
		//객체안에 객체가 들어가게 무조건 클래스 이자리는원래오브젝트가들어가는자리였기때문에 오브젝트의 하위 클래스가 들어가야
		//키는 스트링 뒤는 바뀜 항상
		map.put("신용권", 85);//기본자료형 이건 자동으로 바뀐거 오토박싱 인티저객체로 변환돼서 들어가는구나
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);//홍길동 키가 똑같아 90에다 95가 덮어써짐
		
		System.out.println("총 Entry 수: "+map.size()); //그래서 3개가 됨 //키밸류하나의 쌍으로 해서 하나의 엔트리라고 부른다 쌍
		System.out.println();
		
		String key = "홍길동";
		int value = map.get(key); 
		//홍길동 키 넣어서 겟하면 키가 홍길동인 값이 들어온다 95가 가지고와져서 밸류에 담김
//		왜 인트인가 인티져해도 상관없어 원래는 인티져 리턴 어차피 정수기때문에 래퍼클래서 상관없어 정수니까
		
		//메서드는 첫줄이 다다 무슨 메서드인지 알아야함 
		//출력해보면 알수 있다
		System.out.println(key + ": " + value);//출력
		System.out.println();
		
		Set<String> keySet = map.keySet(); //타입 변수명 키모아놓은 집합  키들이구나
		//List안됨 셋타입에 그안에 스트링들이여러개 객체가 담기고 인덱스없고
		//이터레이터 반복시켜주는놈 반복가능한 그런객체를이터레이터 셋객체를 이터레이터타입으로 리턴해주는 메서드 이름
		//제네릭으로 스트링 안써도된데 오브젝트
		//맵객체에 키들만 따로 뽑아내주는 메서드 자료형이 셋 
		Iterator<String> keyIterator = keySet.iterator(); //이터레이터에 스트링들들어있고
		
		while (keyIterator.hasNext()) { //다음꺼있니?
			String k = keyIterator.next(); //다음꺼로 넘어가면서 값도 리턴
			Integer v = map.get(k);//변수안쓰면 에러남 커서를이해 서치 엘리먼트익셉션
			System.out.println(k + " : " + v);
			
			//밸류만 키만 출력하려면 상관없음
			//넥스트를 여러번하게돼면 한번반복해서 여러번하게돼니까???에러가남
			//코딩을 출력해보는 눈으로 보면서 해보기 이해되면 쉬움 ㅜ멀하고있는지
			
			//신용권찌겼는데 또 넥스트를해버림 없는데 자꾸넥스트를해버리니까 에러 
			//넥스트 한칸내리면서 값내리는거까지
		}
		System.out.println();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();//엔트리는 맵처럼 두개의 제네릭을 키와 밸류로돼있는 셋으로 여러개 들어있는 타입 어떤구조로있는지
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator(); //리턴도 셋 셋이니까 이터레이터
		
		while(entryIterator.hasNext()) {
			
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();//따로따로가지고옴
			Integer v =  entry.getValue();
			System.out.println(k + " : " + v);
			
		}
		System.out.println();
		
		map.remove("홍길동"); //키 삭제하면 하나 줄어들어서
		
		System.out.println("총 Entry 수: "+map.size()); //두개
		System.out.println();

	}

}
