package com.sourceit.java.basic.bohuslavskyi.ht11;

import java.util.List;
import java.util.Map;

/**
 * A class that get a large chunk of a text and get some statistic
 *
 */
public abstract class TextStatistics {
	private String text;
	
	public TextStatistics(String text){
		this.text = text;
	}
	/**
	 * 
	 * @return the entire text
	 */
	public String getText(){
		return text;
	}
	
	/**
	 * 
	 * @param c
	 * @return how often the character occurs in a text
	 */
	public abstract int getCharFrequency(char c);
	/**
	 * 
	 * @param c
	 * @return the number of characters c
	 */
	public abstract int getCharCount(char c);
	
	/**
	 * 
	 * @return collection of unique characters and it's counts
	 */
	public abstract Map<String, Integer> getChars();
	
	/**
	 * 
	 * @return a list of words in a text
	 */
	public abstract List<String> words();
	
	/**
	 * Get count of a char which occurs most frequently
	 * @return
	 */
	public abstract int getMostPopularCharCount();
	public abstract int getLeastPopularCharCount();
	
	public abstract char getCharByCount(int count);
}
