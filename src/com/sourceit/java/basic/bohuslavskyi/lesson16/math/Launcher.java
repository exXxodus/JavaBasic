package com.sourceit.java.basic.bohuslavskyi.lesson16.math;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {
        if (args.length != 3) {
            System.exit(0);
        }
 
        final String INPUT_FILE = args[0];
        final String OUTPUT_FILE = args[1];
        final String SORT_TYPE = args[2];
 
        List<String> list;
 
        list = readFromFile(INPUT_FILE);
        switch (SORT_TYPE) {
        case "abc":
            sortListABC(list);
            break;
        case "cba":
            sortListCBA(list);
            break;
        }
 
        writeToFile(list, OUTPUT_FILE);
    }
 
    public static List<String> readFromFile(String fileName) {
        List<String> listWithStrings = new ArrayList<>();
        String str = null;
 
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {
            while ((str = reader.readLine()) != null) {
                listWithStrings.add(str);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        return listWithStrings;
    }
 
    public static void sortListABC(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
 
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                }
                if (o1.length() < o2.length()) {
                    return -1;
                }
                return 0;
            }
        });
    }
 
    public static void sortListCBA(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
 
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return 1;
                }
                if (o1.length() > o2.length()) {
                    return -1;
                }
                return 0;
            }
        });
    }
 
    public static void writeToFile(List<String> list, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (String str : list) {
                writer.write(str);
                writer.write("\n");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}