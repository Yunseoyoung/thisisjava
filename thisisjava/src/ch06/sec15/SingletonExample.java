package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = obj1;//이거랑같음 사용자들이 접속을 많이해도 하나의 객체만 쓰는거기때문 메모리를 효율적으로 사용가능
		//접속량이 좀 많아지면 자바는 메모리를 해제하는 시간이 딜레이가 있기 때문에 판단하에 안쓰네 판단이 들쑥날쑥하고 시간걸리고 그때까지는 남아이ㅅ음
		//메로리가 계속추가 조금씩 느려지는
		//멤버비으오는 객체마다 달라야해서 싱글톤으로 하면 안됨
		//해야되는게 있고 하지않아야하는게있ㄱ
		//스ㅍ릥은 알아ㅓ해줌 
		
		
		if(obj1 == obj2) {
			System.out.println("같다");
		}else {
			System.out.println("다른");
		}
	}

}
