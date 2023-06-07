package bank;

import lombok.Builder;
import lombok.Data;

@Data
//@Builder //생성자 만드남(?)
public class AccountVO {

	private int no;
	private String number;
	private String owner;
	private int balance;
	
}
