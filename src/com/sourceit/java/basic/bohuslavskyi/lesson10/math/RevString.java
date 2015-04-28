package com.sourceit.java.basic.bohuslavskyi.lesson10.math;

public class RevString {

	public static void main(String[] args) {
		
		System.out.println();

		String s = args[0];

		System.out.println("Params: " + s);

		StringBuilder result = new StringBuilder();
//
//		char[] charArr = s.toCharArray();
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//
//			result.append(charArr[i]);
//
//		}
		
		for (char c : s.toCharArray()) {
			result.insert(0, c);
		}

		System.out.println("Result: " + result);

	}

}
