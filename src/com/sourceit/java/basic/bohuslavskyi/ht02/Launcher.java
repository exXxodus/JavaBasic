package com.sourceit.java.basic.bohuslavskyi.ht02;

import java.util.LinkedList;

public class Launcher {

	public static void main(String[] args) {
		Room r1 = new Room(12, 3, 7);
		Room r2 = new Room();

		LinkedList<Adress> adress = new LinkedList<Adress>();

		adress.add(new Adress("John Smith", "123 Capmtown Road", "Chicago",
				"IL", "60710"));

		r1.volume1();
		r2.volume2();
		r2.square();
		r2.perimeter();
		r2.setColor();
		r2.defLight();

		for (Adress element : adress) {

			System.out.println("Room adress: " + element + "\n");
		}

	}

}
