package com.sourceit.java.basic.bohuslavskyi.ht8;

import java.util.ArrayList;
import java.util.Collections;

public class Launcher {
	public static void main(String[] args) {
		int id = 0;

		ArrayList<Worker> worker = new ArrayList<Worker>();

		worker.add(new FixPaymentWorker(++id, "Stewart Smith", 1000));
		worker.add(new PerHourPaymentWorker(++id, "Morris Williams", 150));
		worker.add(new FixPaymentWorker(++id, "Morgan Brown", 5000));
		worker.add(new PerHourPaymentWorker(++id, "Howard Thompson", 150));
		worker.add(new FixPaymentWorker(++id, "James Martin", 10000));
		worker.add(new PerHourPaymentWorker(++id, "Foster Anderson", 200));
		worker.add(new FixPaymentWorker(++id, "Kelly Robinson", 15000));
		worker.add(new PerHourPaymentWorker(++id, "Murphy Allen", 250));
		worker.add(new FixPaymentWorker(++id, "Ross Clark", 20000));
		worker.add(new PerHourPaymentWorker(++id, "Coleman Scott", 300));

		System.out.println("All workers:");
		Collections.sort(worker);

		for (Worker w : worker) {
			System.out.println(w);
		}

		System.out.println("First five worker's names:");
		for (int i = 0; i < 5; i++) {
			System.out.println(worker.get(i).getName());
		}

		System.out.println("Last three worker's id:");
		for (int i = worker.size() - 3; i < worker.size(); i++) {
			System.out.println(worker.get(i).getID());
		}
	}
}
