package com.sourceit.java.basic.bohuslavskyi.ht11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class TextStatisticsReal extends TextStatistics {

	public TextStatisticsReal(String text) {
		super(text);
	}

	public static void main(String[] args) {

		TextStatisticsReal result = new TextStatisticsReal(
				"London is the capital of Great Britain");
		result.getCharFrequency('o');
		result.getCharCount('o');
		result.getChars();
		result.words();
		result.getMostPopularCharCount();
		result.getLeastPopularCharCount();
		result.getCharByCount(0);

	}

	@Override
	public int getCharFrequency(char c) {
		char[] symbol = getText().toCharArray();
		int count = 0;
		int totalCount = 0;
		for (int i = 0; i < symbol.length; ++i) {
			if (symbol[i] == c) {
				++count;
			}
			totalCount++;
		}
		System.out.printf("Frequency of selected char: %.2f", (double) count
				/ totalCount);
		System.out.println();
		return count;
	}

	@Override
	public int getCharCount(char c) {
		char[] symbol = getText().toCharArray();
		int count = 0;
		for (int i = 0; i < symbol.length; ++i)
			if (symbol[i] == c)
				++count;
		System.out.println("Count of selected char" + " -> " + count);
		return count;
	}

	@Override
	public Map<String, Integer> getChars() {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < getText().length(); ++i) {
			char c = getText().charAt(i);
			if (Character.isLetter(c)) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Char: " + entry.getKey() + " -> "
					+ "quantity: " + entry.getValue());
		}
		return null;
	}

	@Override
	public List<String> words() {
		String[] strArray = getText().split("[.,?!;:]*[\\s]+|[.]{1}");
		List<String> list = new ArrayList<String>();
		for (String x : strArray) {
			String s = x.replaceAll("^[({/\\\'\"\\[]*|[)}/\\\'\"\\]]*$", "");
			if (Pattern.compile("^[a-z]+['-]?[a-z]+$|^[a-z]+$")
					.matcher(s.toLowerCase()).matches()) {
				list.add(s);
			}
			System.out.println(s);
		}
		return list;
	}

	@Override
	public int getMostPopularCharCount() {

		int[] intArray = new int[256];
		int max = 0;
		int indexOfMaxInString = -1;
		int indexOfMax = -1;
		int indexOfEqualMax = -1;
		for (int i = 0; i < getText().length(); i++) {
			int intValue = getText().charAt(i);
			intArray[intValue]++;
			if (intArray[intValue] > max) {
				max = intArray[intValue];
				indexOfMax = intValue;
				indexOfEqualMax = -1;
			} else if (intArray[intValue] == max) {
				indexOfEqualMax = intValue;
				int indexOfEqualMaxInString = i;
				if (indexOfMaxInString == -1)
					indexOfMaxInString = i;
				if (indexOfEqualMaxInString < indexOfMaxInString) {
					indexOfMax = indexOfEqualMax;
					indexOfMaxInString = indexOfEqualMaxInString;
				}
			}
		}
		System.out.println("Most popular char's quantity -> "
				+ intArray[indexOfMax]);

		return indexOfMax;
	}

	@Override
	public int getLeastPopularCharCount() {
		return 0;

	}

	@Override
	public char getCharByCount(int count) {
		return 0;

	}

}
