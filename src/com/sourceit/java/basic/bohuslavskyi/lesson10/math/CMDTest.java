package com.sourceit.java.basic.bohuslavskyi.lesson10.math;

public class CMDTest {

	public static void main(String[] args) {

		int sum = 0;

		if (args.length == 1) {
			System.out.println("Error");
		}

		else {
			for (int i = 0; i < args.length; i++) {
				sum += Integer.parseInt(args[i]);

			}
			System.out.println(sum);

		}

	}

}
