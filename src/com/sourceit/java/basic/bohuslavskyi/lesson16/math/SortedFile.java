package com.sourceit.java.basic.bohuslavskyi.lesson16.math;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedFile {

	private static final String INPUT_FILE = "C:\\Country.txt";
	private static final String OUTPUT_FILE = "C:\\SortedCountry.txt";

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>(new Comparator<String>() {
			public int compare(String a, String b) {
				int diff = a.length() - b.length();
				if (diff == 0)
					diff = a.compareTo(b);

				return (diff == 0) ? 1 : diff;
			}
		});

		try (Scanner scanner = new Scanner(new File(INPUT_FILE))) {
			while (scanner.hasNext())
				set.add(scanner.nextLine());
		} catch (FileNotFoundException fnfe) {
			System.err.println("Can't open input file!");
			return;
		} catch (IllegalStateException ise) {
			System.err.println("Can't read from input file!");
			return;
		}

		if (set.isEmpty()) {
			System.err.println("Input file is empty!");
			return;
		}

		try (PrintStream ps = new PrintStream(OUTPUT_FILE)) {
			for (String str : set)
				ps.println(str);
		} catch (IOException ioe) {
			System.err.println("Can't write to output file!");
			return;
		}

		System.err.println("Done.");
	}

}
