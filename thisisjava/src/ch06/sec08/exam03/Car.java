package ch06.sec08.exam03;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	void setGas(String gas) {
		this.gas = Integer.parseInt(gas);
	}
	void setGas(int gas, String a) {
		this.gas = 0;
	}
	void setGas(String gas, int a) {
		this.gas = 0;
	}
	
	boolean isLeftGas() { //is 어쩌구는 트루또는폴스 뭐뭐 가지고있니? 남았으면 트루 아님 폴스
		if(gas ==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) { //범위가 중요
			if(gas >0) {
				System.out.println("달립니다. (gas잔량:" +gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas잔량:" + gas +")");
				return; //break;
				//
			}
		}
//		System.out.println();
	}

	public static void main(String[] args) {
		
	}

}
