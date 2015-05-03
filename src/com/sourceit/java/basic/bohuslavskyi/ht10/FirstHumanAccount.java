package com.sourceit.java.basic.bohuslavskyi.ht10;

import java.math.BigDecimal;

class FirstHumanAccount extends BankAccount {

	public FirstHumanAccount(String owner) {
		this(BigDecimal.ZERO, owner);
	}

	public FirstHumanAccount(BigDecimal balance, String owner) {
		this.balance = balance;
		this.owner = owner;
	}

	public synchronized void deposit(BigDecimal money) {
		BigDecimal newBalance = balance.add(money);
		System.out.println("Кладем на первый счет " + money + getCurrencyName() + ", на первом счету " + newBalance + getCurrencyName() + ".");
		balance = newBalance;
	}

	public void deposit(String money) {
		deposit(new BigDecimal(money));
	}

	public synchronized void transferMoney(FirstHumanAccount fromAccount,
			SecondHumanAccount toAccount, BigDecimal money) {
		fromAccount.debit(money);
		toAccount.credit(money);
	}

	public synchronized void debit(BigDecimal money) {
		BigDecimal newBalance = balance.subtract(money);
		balance = newBalance;
		System.out.println("Переводим " + money + getCurrencyName() + " на второй счет, остаток на первом счету " + newBalance + getCurrencyName() + ".");
	}
	
	public void debit(String money) {
		debit(new BigDecimal(money));
	}

	public BigDecimal getMoneyCount() {
		return balance;
	}

	public String printBalance() {
		return "FirstHumanAccount balance after all operations: " + getMoneyCount() + getCurrencyName() + ".";
	}
}
