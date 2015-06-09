package com.sourceit.java.basic.bohuslavskyi.lesson19.lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WGetConsoleExample {

	public static final String[] COMMANDS = { "Save page", "Display title",
			"Find a word", "List all URL's on the page" };

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println(getInstructions());
			return;
		}

		String command = args[0];
		if ("-i".equals(command)) {
			// TODO ask for URL

			System.out.println("Enter an URL:");
		} else if (!command.startsWith("http")) {
			System.out.println(getInstructions());
			return;
		}

		System.out.println("Select what to do next:");

		for (int i = 0; i < COMMANDS.length; i++) {
			System.out.println((i + 1) + ") " + COMMANDS[i]);
		}

		int choise = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			choise = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		executeCommand(choise, args[0]);
	}

	private static void executeCommand(int commandNumber, String location) {
		switch (commandNumber) {
		case 1:
			saveUrlToFile(location);
			break;

		default:
			break;
		}
	}

	public static String getInstructions() {
		return "Usage: some web address\n" + "      or -i\n"
				+ "Example: http://google.com";
	}

	public static void getContentFromPage() {
		URL url;
		InputStream is = null;
		BufferedReader br;
		String line;

		try {
			url = new URL(
					"https://dl.dropboxusercontent.com/u/56274892/Java-Basic/index.html");
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception ex) {
			System.out.println("Smth. wrong" + ex);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}

	}

	public static void saveUrlToFile(String location) {
		URL url;

		try {
			url = new URL(location);
			URLConnection conn = url.openConnection();

			BufferedReader br = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String inputLine;

			String fileName = "C://CurrentURL.html";
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			while ((inputLine = br.readLine()) != null) {
				bw.write(inputLine);
			}

			bw.close();
			br.close();

			System.out.println("Your file is saved in " + fileName
					+ " location.");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
