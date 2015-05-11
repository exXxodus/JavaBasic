package com.sourceit.java.basic.bohuslavskyi.ht10;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Bank {	
	
	private Set<BankAccount> bankAccounts = new HashSet<BankAccount>();	

	public void setBankAccounts(Set<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public Set<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void createAccout(BankAccount ba) {
		bankAccounts.add(ba);
	}
	
	public void transferMoneyFromBankToClient(Bank fromAccount,
			FirstHumanAccount toAccount, BigDecimal money) {
		fromAccount.debit(money);
		toAccount.credit(money);
	}

	public void debit(BigDecimal money) {
		System.out.println("Crediting " + money + getCurrencyName() + " from bank.");		
	}
	
	public String getCurrencyName() {
		return "$";
	}
}