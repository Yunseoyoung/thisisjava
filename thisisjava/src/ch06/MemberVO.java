package ch06;

public class MemberVO {
	private int memberid;
	private String id;
	private String name;
	private String pwd;
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	/*public int getMemberid() { //메서드 호출 안만들면 기능안한대 노가다 코딩
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}*/
	
	//getter setter 자동 생성
	//alt shift s >r > alt+a > r 자동으로 만들어짐
	//source generate getters and setters > select all > generate
}
