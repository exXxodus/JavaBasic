package com.sourceit.java.basic.bohuslavskyi.lesson26;

class Person {
	// Instance variables
	private String name;
	private int age;

	// Constructor
	public Person(String _name, int _age) {
		String name = _name;
		int age = _age;
	}

	// Instance methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
