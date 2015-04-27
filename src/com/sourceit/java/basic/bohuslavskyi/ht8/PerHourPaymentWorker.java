package com.sourceit.java.basic.bohuslavskyi.ht8;

import java.text.NumberFormat;
import java.util.Locale;

class PerHourPaymentWorker extends Worker {
	static final double WORKING_HOURS_IN_MONTH = 8.0 * 20.8;

	private double hourPayment;

	PerHourPaymentWorker(int id, String name, double hourPayment) {
		super(id, name);
		this.hourPayment = hourPayment;
	}

	@Override
	double getAveragePayment() {
		return hourPayment * WORKING_HOURS_IN_MONTH;
	}

	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		return super.toString() + " per hour " + nf.format(getAveragePayment());
	}

}
