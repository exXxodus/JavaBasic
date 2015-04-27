package com.sourceit.java.basic.bohuslavskyi.ht8;


public abstract class Worker implements Comparable<Worker> {
	private int id;
	private String name;

	Worker(int id, String name) {
		this.id = id;
		this.name = name;
	}

	String getName() {
		return name;
	}

	String getID() {
		return "#" + id;
	}

	abstract double getAveragePayment();

	public String toString() {
		return "#" + id + " " + name;
	}

	@Override
	public int compareTo(Worker worker) {
		double diff = this.getAveragePayment() - worker.getAveragePayment();
		if (diff > 0.0)
			return -1;
		else if (diff < 0.0)
			return 1;
		else {
			int n = this.getName().compareTo(worker.getName());
			return (n == 0) ? 1 : n;
		}
	}
}
