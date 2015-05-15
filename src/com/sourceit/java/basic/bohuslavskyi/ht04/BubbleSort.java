package com.sourceit.java.basic.bohuslavskyi.ht04;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[10];
		System.out.println("Random array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.print(array[i] + " ");
		}

		SortRun sr = new SortRun(array);

		array = sr.bubbleSort();

		System.out.println("\nSorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
