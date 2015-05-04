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

	public void deposit(BigDecimal money) {
		BigDecimal newBalance = balance.add(money);
		System.out.println("Adding to first account " + money + getCurrencyName() + ", current " + owner + "'s balance - " + newBalance + getCurrencyName() + ".");
		balance = newBalance;
	}

	public void deposit(String money) {
		deposit(new BigDecimal(money));
	}

	public void transferMoney(FirstHumanAccount fromAccount,
			SecondHumanAccount toAccount, BigDecimal money) throws NotEnoughMoneyException {
		fromAccount.debit(money);
		toAccount.credit(money);
	}

	public void debit(BigDecimal money) throws NotEnoughMoneyException {
		BigDecimal newBalance = balance.subtract(money);
		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new NotEnoughMoneyException();
		} else {
		balance = newBalance;
		System.out.println("Transfering " + money + getCurrencyName() + " to second account, " + owner + "'s balance after transfer - " + newBalance + getCurrencyName() + ".");
	}
}
	
	public void debit(String money) throws NotEnoughMoneyException {
		debit(new BigDecimal(money));
	}

	public BigDecimal getMoneyCount() {
		return balance;
	}

	public String printBalance() {
		return owner + "'s balance after all operations: " + getMoneyCount() + getCurrencyName() + ".";
	}
}
