package ch06;

public class ShopService18 {
	private static ShopService18 singleton = new ShopService18();//변수명아무거나
	
	private ShopService18() {
		
	}
	
	public static ShopService18 getInstance() {//메서드는 아무데서나 객체생성없이
		if(singleton == null) singleton = new ShopService18();
		// 가비지 콜렉터가 버릴수가 있어서 힙에 들어가는순간 버릴수잇으니
		//당분간 남아있지만 나중에 버릴수있어서 
		//뉴는 맨처음한번 가비지콜렉터가 버릴수있는 혹시모르는 그때 두군데 실무
		return singleton;
	}

}
