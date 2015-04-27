package com.sourceit.java.basic.bohuslavskyi.ht4;

public class SortRun {
	private int[] array;

	public SortRun(int[] array) {
		this.array = array;
	}

	private void swap(int[] array, int index) {
		int temp = array[index - 1];
		array[index - 1] = array[index];
		array[index] = temp;
	}

	public int[] bubbleSort() {
		int[] arr = array;

		for (int i = 1; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= i; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j);
				}
			}
		}

		return arr;
	}

}
