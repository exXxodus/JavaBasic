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

	public synchronized void credit(BigDecimal money) {
		BigDecimal newBalance = balance.add(money);
		balance = newBalance;
		System.out.println("Получаем " + money + getCurrencyName() + ", на втором счету " + newBalance + getCurrencyName() + ".");
	}
	
	public void credit(String money) {
		credit(new BigDecimal(money));
	}

	public synchronized void withdraw(BigDecimal money) throws NotEnoughMoneyException {
		BigDecimal newBalance = balance.subtract(money);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new NotEnoughMoneyException();
		} else {
			balance = newBalance;
			System.out.println("Снимаем со второго счета " + money + getCurrencyName() + ", остаток на счету " + balance + getCurrencyName() + ".");
		}
	}

	public void withdraw(String money) throws NotEnoughMoneyException {
		withdraw(new BigDecimal(money));
	}

	public BigDecimal getMoneyCount() {
		return balance;
	}

	public String printBalance() {
		return "SecondHumanAccount balance after all operations: " + getMoneyCount() + getCurrencyName() + ".";
	}
}
