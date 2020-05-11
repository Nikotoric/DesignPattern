package webShop;

import java.util.UUID;

public class BankAccount {
	
	private Customer customer;
	private int bankAccId;
	private static int cnt = 100;
	private String usrName;
	private String passwd;
	
	public BankAccount(Customer customer) {
		this.customer = customer;
		this.bankAccId = cnt;
		cnt++;
		usrName = generateString();
		passwd = generateString();
	}
	
	
	private String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }


	public Customer getCustomer() {
		return customer;
	}


	public int getBankAccId() {
		return bankAccId;
	}


	public String getUsrName() {
		return usrName;
	}


	public String getPasswd() {
		return passwd;
	}


	@Override
	public String toString() {
		return "BankAccount [customer=" + customer + ", bankAccId=" + bankAccId + ", usrName=" + usrName + ", passwd="
				+ passwd + "]";
	}
	
	

}
