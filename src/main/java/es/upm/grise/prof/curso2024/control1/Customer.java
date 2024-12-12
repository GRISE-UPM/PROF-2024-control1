package main.java.es.upm.grise.prof.curso2024.control1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private List<Account> accounts;
	
	public Customer() {
		accounts = new ArrayList<Account>();
	}
	
	public String getAccountWithHighestBalance() throws NoAccountsException {
		
		if(accounts.isEmpty()) {
			throw new NoAccountsException();
		}
		
		
		String selectedAccount = "";
		float maxBalance = 0;
		
		for(Account account : accounts) {
			
			if(account.getCurrentBalance() > maxBalance) {
				
				selectedAccount = account.getAccountNumber();
				
			}
			
		}
		
		return selectedAccount;
		
	}
	
	public void setAccounts(List<Account> list) {
		this.accounts = list;
	}
	
}
