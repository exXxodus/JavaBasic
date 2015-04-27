package com.sourceit.java.basic.bohuslavskyi.ht5;

public class FooTask {

	void fooBar(int n) {

		for (int i = 1; i <= n; i++) {
			if (isMultipleOfThreeAndFive(i)) {
				System.out.println("FooBar");
			} else if (isMultipleOfThree(i)) {
				System.out.println("Foo");
			} else if (isMultipleOfFive(i)) {
				System.out.println("Bar");
			} else {
				System.out.println(i);
			}
		}
	}

	public boolean isMultipleOfFive(int i) {
		return (i % 5 == 0);
	}

	public boolean isMultipleOfThree(int i) {
		return (i % 3 == 0);
	}

	public boolean isMultipleOfThreeAndFive(int i) {
		return (i % 5 == 0 && i % 3 == 0);
	}

	public static void main(String[] args) {

		FooTask s = new FooTask();
		int n = 15;
		s.fooBar(n);

	}
}
