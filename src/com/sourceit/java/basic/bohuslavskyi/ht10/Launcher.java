package com.sourceit.java.basic.bohuslavskyi.ht10;

import java.math.BigDecimal;

public class Launcher {
	
	static Bank bank = new Bank();

	static BankAccount account1 = new FirstHumanAccount("John Smith");
	static BankAccount account2 = new SecondHumanAccount("Jane Smith");

	public static void main(String[] args) throws NotEnoughMoneyException {
		
		bank.createAccout(account1);
		bank.createAccout(account2);
		bank.debit(new BigDecimal(1000));
		
		account1.deposit("1000");
		account1.debit("250");
		account2.credit("250");
		account2.withdraw("150");
		
		System.out.println(account1.printBalance());
		System.out.println(account2.printBalance());

	}
}
