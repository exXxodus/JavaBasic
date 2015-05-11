package com.sourceit.java.basic.bohuslavskyi.ht10;

import java.math.BigDecimal;

class SecondHumanAccount extends BankAccount {

	public SecondHumanAccount(String owner) {
		this(BigDecimal.ZERO, owner);
	}

	public SecondHumanAccount(BigDecimal balance, String owner) {
		this.balance = balance;
		this.owner = owner;
	}

	public void credit(BigDecimal money) {
		BigDecimal newBalance = balance.add(money);
		balance = newBalance;
		System.out.println("Receiving " + money + getCurrencyName() + " from first account, current " + owner + "'s balance - " + newBalance + getCurrencyName() + ".");
	}
	
	public void credit(String money) {
		credit(new BigDecimal(money));
	}

	public void withdraw(BigDecimal money) throws NotEnoughMoneyException {
		BigDecimal newBalance = balance.subtract(money);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new NotEnoughMoneyException();
		} else {
			balance = newBalance;
			System.out.println("Withdrawing from second account " + money + getCurrencyName() + ", " + owner + "'s balance after withdrawing - " + balance + getCurrencyName() + ".");
		}
	}

	public void withdraw(String money) throws NotEnoughMoneyException {
		withdraw(new BigDecimal(money));
	}

	public BigDecimal getMoneyCount() {
		return balance;
	}

	public String printBalance() {
		return owner + "'s balance after all operations: " + getMoneyCount() + getCurrencyName() + ".";
	}

	public String getCurrencyName() {
		return "$";
	}
}
