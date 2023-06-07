package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Board > list = new ArrayList<>(); //리스트 타입으로 어레이 리스트라고 써도 됨
		ArrayList<Board > list = new ArrayList<>(); //리스트 타입으로 어레이 리스트라고 써도 됨
		//리스트로 쓴 이유는 글씨가 적어서 쓴것 다형성을 고민해서 쓴 건아님 의미가없음
		//어레이리스트 객체를 생성 list 안에는 뭔가 들어있지않음 널은 아님 널인상태는 널이라고 해야 널인거
		//어레이리스트 객체가 들어감 객체 안에는아무것도 안들어감 어레이객체만생성돼서 대입
		
		System.out.println(list.size()); //0 사이즈가 0 이프문써도 0인지 아닌지만 보면됨 객체를 넘겨줘도 어차피 넘어온다
		//포문돌릴때 신경쓸필요없다
		//게시판이다 0부터 사이즈까지 알아서 돌아가는데 0이면 조건만족하지않으니까 포문실행안돼
		//게시글이없다해서 아무것도 안나오지않음 등록된글이없다 이프문
//		
//		if(list.size()==0) {
//			System.out.println("등록된 글이 없습니다.");
//		}else {
//			for문
//		}
//		
		//안쪽부터 보기 뉴부터 실행끝남 보드객체생성 서브젝트 컨텐트 라이터에 각각 초기화 셋을한상태로 보드객체를 생성 
		//새로운 뉴
		//이 안에 보드 객체가 다섯개 생김
		
		//세개의 게시판을 어레이리스트 
		list.add(new Board("제목1","내용1","글쓴이1")); //0번
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));

		
		int size = list.size();
		System.out.println("총 객체 수: "+size); //5개
		System.out.println();
		
		Board board = list.get(2);//2번 인덱스
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();//이스케이프 문자 티는 탭영역만큼 띄워주는 역할 드래그 한칸으로 인식 한탭
		//탭키 하나 
		
		
		//전체길이의 1뺀값 어레이리스트는 사이즈란 메서드
		//배열은 렝스라는 필드
		//렝스에러 그럼 컨드롤 스페이스 사이즈구나
		//에드 사이즈 겟 값넣고 출력
		for(int i =0; i<list.size();i++) { //0부터 마지막인덱스까지 0부터 4까지
//			Board b = list.get(i); //0번째객체를 게해서 비에담음 겟은 보드다 형변환할필요없고 다른걸넣을수도없다 i번째 객체가 담기고 i번째 객체를 가지고 .겟서브제그
			System.out.println(list.get(i).getSubject()+"\t" + list.get(i).getContent() + "\t" + list.get(i).getWriter());
			//리턴한 겍채에 점해서 겟서브젝트 
//			System.out.println(b.getSubject()+"\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println();
		
		list.remove(2);//제거되고 땡겨진다 //삭제는 디비에서 함 딜리트
		list.remove(2);
		
		for(Board b : list) {
			System.out.println(b.getSubject()+"\t" + b.getContent() + "\t" + b.getWriter());
		}//향상된 포문 반복가능하면 다들어올수있음 배열도 객체도 임시변수 비에 앞에서부터 차례로  담기니까
//		Iterator<List<Board>> iter = map.values().iterator();
//		while (iter.hasNext()) {
//			<List<Board> lb = iter.next();
//			for(Board b : lb) {
//				System.out.println(b.getSubject());
//			}
//		}
		
//		Iterator<Board> ib = data.iterator();
		
		
//		map.values
	}


}
