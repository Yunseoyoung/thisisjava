package ch06.sec15;

public class Account {
	
	private int balance; //static은 안돼 각각객체마다 있어야함
	
	static final int MIN_BALANCE  = 0;
	static final int MAX_BALANCE = 1000000;
	
	public int setBalance(int balance) {
//		int t = this.balance + balance; //입금을 말하는게 아니라 뺌
		//값을 가지고 오는거 값을 바꿔버리는거 잔고를 저장하는
		if(MIN_BALANCE <= balance && MAX_BALANCE >= balance) {
			this.balance = balance;
			
		}
		
		
		return balance;
	}
	/*public int getBalance(int balance) {
		
		
		return balance;
	}*/
	
	public int getBalance() {
			
			
			return balance;
		}

}
