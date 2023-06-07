package ch06;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService18 obj1 = ShopService18.getInstance();
		ShopService18 obj2 = ShopService18.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
	}

}
