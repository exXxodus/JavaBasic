package com.sourceit.java.basic.bohuslavskyi.ht10;

import java.math.BigDecimal;

public abstract class BankAccount extends Bank {

	public BigDecimal balance;
	public String owner;	

	public BankAccount() {}

	public void deposit(BigDecimal money) {}	
	public void deposit(String money) {}

	public void withdraw(BigDecimal money) throws NotEnoughMoneyException {}
	public void withdraw(String money) throws NotEnoughMoneyException {}
	
	public void transferMoney() {}
	
	public void debit(BigDecimal money) throws NotEnoughMoneyException {}
	public void debit(String money) throws NotEnoughMoneyException {}
	
	public void credit(BigDecimal money) {}
	public void credit(String money) {}
	
	public abstract BigDecimal getMoneyCount();
	
	public abstract String printBalance();
}