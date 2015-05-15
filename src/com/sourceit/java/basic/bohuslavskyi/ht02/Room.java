package com.sourceit.java.basic.bohuslavskyi.ht02;

class Room {
	public int width;
	public int height;
	public int length;
	public final String color = "green";
	private double furnitureCost = 5000;
	public boolean light;

	// Room before redevelopment.
	Room(int w, int h, int l) {
		width = w;
		height = h;
		length = l;
	}

	// Room after redevelopment.
	Room() {
		width = 15;
		height = 4;
		length = 10;
	}

	void volume1() {
		System.out.println("First Volume = " + width * height * length
				+ " cubic meters");
	}

	void volume2() {
		System.out.println("Second Volume = " + width * height * length
				+ " cubic meters");
	}

	void square() {
		System.out.println("Square = " + width * length + " square meters");
	}

	void perimeter() {
		System.out.println("Perimeter = " + (width + length) * 2 + " meters");
	}

	void setColor() {
		System.out.println("Room Color is " + color + ".");
	}

	private void printCost() {
		System.out.println("The cost of Furniture = " + furnitureCost + " $");
	}

	void defLight() {
		if (height > 3)
			System.out.println("Room is well lighted.");
		else
			System.out.println("Room is dark.");
	}
}
