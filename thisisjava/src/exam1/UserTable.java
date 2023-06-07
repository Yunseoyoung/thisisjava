package exam1;

import java.util.ArrayList;
import java.util.List;

public class UserTable {
	List<User> userList;
	int no; // 자동증가할 번호
	
	// 생성자(필드 초기화)
	UserTable() {
		List<User> userList = new ArrayList<>() ;
		no = 1;
	}
	
	/*
	 * 번호, 아이디, 비밀번호, 이름 입력받아
	 * User객체에 담아 리턴
	 */
	public User getUser(int no, String id, String pwd, String name) {
		User u = new User();
		u.setNo(no);
		u.setId(id);
		u.setPwd(pwd);
		u.setName(name);
		return u;
	}
	
	/*
	 * 아이디, 비밀번호, 이름 입력받아
	 * 현재 list에서 아이디가 존재하는지 여부 체크
	 * getUser 메서드를 호출 객체 리턴받아 변수에 저장
	 * 존재하면 false 리턴
	 * 존재하지 않으면 리스트에 추가하고 true 리턴
	 *
	 * 수정 : findUser 메서드 활용
	 * 수정 : no를 1씩 증가되서 저장되도록
	 */
	public boolean insert(String id, String pwd, String name) {
		//findUser() {};
		User u = new User(no, id, pwd, name);
		u.setNo(no);
	}
	
	/*
	 * 아이디를 입력받아 리스트에 해당 아이디의 객체 리턴
	 * 존재하지 않으면 null 리턴
	 */
	public User findUser(String id) {
		
		for(int i=0;i<userList.size();i++) {
			if(id == userList.get(i).getId()) {
				return userList.get(i);
			}
		}
		
		return null;
	
	}
	
	/*
	 *  id로 이름,비밀번호 변경
	 */
//	public boolean update(String id, String name, String pwd) {
//		if() {
//			return false;
//		}else {
//			return true;
//		}
//	}


}
