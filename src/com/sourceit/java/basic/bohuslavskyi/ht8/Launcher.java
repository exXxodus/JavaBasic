package com.sourceit.java.basic.bohuslavskyi.ht8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Launcher {
	public static void main(String[] args) {
		int id = 0;

		Set<Worker> workers = new TreeSet<>(new Comparator<Worker>() {
			public int compare(Worker a, Worker b) {
				double diff = a.getAveragePayment() - b.getAveragePayment();
				if (diff > 0.0)
					return -1;
				else if (diff < 0.0)
					return 1;
				else {
					int n = a.getName().compareTo(b.getName());
					return (n == 0) ? 1 : n;
				}
			}
		});

		workers.add(new FixPaymentWorker(++id, "Stewart Smith", 1000));
		workers.add(new PerHourPaymentWorker(++id, "Morris Williams", 150));
		workers.add(new FixPaymentWorker(++id, "Morgan Brown", 5000));
		workers.add(new PerHourPaymentWorker(++id, "Howard Thompson", 150));
		workers.add(new FixPaymentWorker(++id, "James Martin", 10000));
		workers.add(new PerHourPaymentWorker(++id, "Foster Anderson", 200));
		workers.add(new FixPaymentWorker(++id, "Kelly Robinson", 15000));
		workers.add(new PerHourPaymentWorker(++id, "Murphy Allen", 250));
		workers.add(new FixPaymentWorker(++id, "Ross Clark", 20000));
		workers.add(new PerHourPaymentWorker(++id, "Coleman Scott", 300));

		Iterator<Worker> iterator = workers.iterator();		
		while (iterator.hasNext()) {		
			System.out.println(iterator.next());
		}
		
		System.out.println("First worker:\n" + ((TreeSet<Worker>) workers).last());
		System.out.println("Last worker:\n" + ((TreeSet<Worker>) workers).first());		
		
	}
}