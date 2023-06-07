package exam;

import java.util.ArrayList;
import java.util.List;

public class UserTable {
	List<User> userList; //필드가 두개 //얘는 널로
	int no; // 자동증가할 번호 //번호 따로 뺀이유 등록할때 1씩 증가 테이블이아닌데 테이블처럼 씀 //자동초기화됨 0
	//마지막 피케이가 들어가게하려고 0 1 두번째 에드되면 2가되고 총 길이가 결국엔 들어가져있다
	
	// 생성자(필드 초기화)
	UserTable() {
		userList = new ArrayList<>();
		no =1;//1부터 시작이라 실제 디비가 이렇게 돼있다
	}
	
	/*
	 * 번호, 아이디, 비밀번호, 이름 입력받아 코딩돼있엇고
	 * User객체에 담아 리턴
	 */
	public User getUser(int no, String id, String pwd, String name) { //객체리턴
		//매개변수를 받고있는데 메인크래스에서 매번 셋셋셋을 걔속해야돼 귀찮 코드 중복 그래서 그렇게 안하고 넣어서
		User u = new User();
		u.setNo(no);
		u.setId(id);
		u.setName(name);
		u.setPwd(pwd);
		return u; //여기 다 리턴~~~~~ 여러군데쓰일수있으니까 따로 만듬 생성자가 아니더라도 원하는것만 셋하고 싶어서 다 초기화하는게 아니라 원하는것만 초기화해서 넣어서 
		//새로운 객체에다 넣으려고
	}	
	
	/*
	 * 아이디, 비밀번호, 이름 입력받아 
	 * 현재 list에서 아이디가 존재하는지 여부 체크 췤
	 * getUser 메서드를 호출 객체 리턴받아 변수에 저장
	 * 존재하면 false 리턴 //if r > 1 return false;
	 * 존재하지 않으면 리스트에 추가하고 true 리턴 // else r = -1 return true
	 *
	 * 수정 : findUser 메서드 활용 
	 * 수정 : no를 1씩 증가되서 저장되도록 //no++
	 */
	
	
	public boolean insert(String id, String pwd, String name) {
		if(findUser(id)==null) { //끝까지 뒤졋는데도 없다 기존 존재한어레이리스트 객체에다가 유저 객체를 메서드아님 
			userList.add(getUser(no++, id, pwd, name));
			return true; //트루 리턴하고 끝
		}return false;
	}
	
	/*
	 * 아이디를 입력받아 리스트에 해당 아이디의 객체 리턴 //return
	 * 존재하지 않으면 null 리턴 //return null;
	 */
	public User findUser(String id) {
		//있으면 객체 를 리턴
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).getId().equals(id)) { //처음부터 끝까지 싹 다 비교
				return userList.get(i);
			}
		}
		return null;
		
		//없는지를 체크해라 라면
		
//		int check = false;이렇게 하지마라
//		for() {
//			if() {
//				check=true;
//			}else {
//				check=false; //앞에있다가 뒤에있으면 에러가 난다 폴스가 들어가져서
//			}
//		}
		
		//찾는거	
	}
	
	/*
	 *  id로 이름,비밀번호 변경 
	 */
	public boolean update(String id, String name, String pwd) {	//변경 잘되면 트루 안되면 폴스	
		User u = findUser(id); //참조주소가들어있고
		if(u==null) {
			return false;
		} else {
			u.setName(name);
			u.setPwd(pwd);
			return true;
		}
		
		
	}
	
	
}
