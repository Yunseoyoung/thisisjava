package ch12.sec03.exam05;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
//@Con
public class Member {
	
	private String id;
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name.replace("바보", "");
	}//안만든것만 추가적으로 만듬 롬복이
	//별도로 뭔가가 필요하면 알아서 코딩하면 됨
	//화면에 출력할때 년월일시간분초영점일초 패턴 여러가지 활용하는방법
	//모든 라이브러리가 게터세터를씀
	
	
	/**
	 * 아이디와 비밀번호를 입력받아 로그인 여부를 확인하는 메서드
	 * @param id 아이디
	 * @param pwd 비밀번호
	 * @return 로그인여부(true/ false)
	 */
	public boolean login(String id, String pwd) {
		//디비연결, 조회, 결과 리턴
		return true;
	}

}
