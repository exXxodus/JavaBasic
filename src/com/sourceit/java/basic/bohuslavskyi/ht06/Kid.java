package com.sourceit.java.basic.bohuslavskyi.ht06;

public class Kid extends Kindergarten {

	public Kid(String name, String action, String iceCream) {
		this.name = name;
		this.action = action;
		this.iceCream = iceCream;
	}

	public String toString() {
		return "Kid: " + name + ", action: " + action + ", type of ice cream: "
				+ iceCream + ".";
	}

}
