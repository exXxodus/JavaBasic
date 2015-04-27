package com.sourceit.java.basic.bohuslavskyi.ht8;

import java.text.NumberFormat;
import java.util.Locale;

class FixPaymentWorker extends Worker {
	private double monthPayment;

	FixPaymentWorker(int id, String name, double monthPayment) {
		super(id, name);
		this.monthPayment = monthPayment;
	}

	@Override
	double getAveragePayment() {
		return monthPayment;
	}

	@Override
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
		return super.toString() + " fixed " + fmt.format(getAveragePayment());
	}
}

