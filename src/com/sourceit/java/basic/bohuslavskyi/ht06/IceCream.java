package com.sourceit.java.basic.bohuslavskyi.ht06;

public class IceCream extends IceCreamProvider {

	public IceCream(String iceCream) {
		IceCreamProvider.iceCream = iceCream;
	}

	public String toString() {
		return "ice cream" + iceCream;
	}
}
