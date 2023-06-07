package bank1;


import lombok.Data;

@Data
public class AccountVO {

	private int no;
	private String number;
	private String owner;
	private int balance;
}