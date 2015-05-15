package com.sourceit.java.basic.bohuslavskyi.ht06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher implements Action {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String iceCream = "";
		IceCream icecream = new IceCream(iceCream);
		IceCreamProvider icp = new IceCreamProvider();
		icp.deliver(icecream);

		while (true) {
			System.out.println("Enter kid's name:");
			String name = br.readLine();
			if (name.isEmpty())
				break;
			System.out.println("Enter expected action:");
			String action = br.readLine();
			System.out.println("Enter type of ice cream:");
			iceCream = br.readLine();

			Kid kid = new Kid(name, action, iceCream);
			list.add(kid);
		}
		printList();
	}

	public static void printList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
