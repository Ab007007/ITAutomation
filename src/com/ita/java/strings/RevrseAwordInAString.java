package com.ita.java.strings;

public class RevrseAwordInAString {

	public static void main(String[] args) {
		String str = "Hi welcome to word reverse";
		
		String[] words = str.split(" ");
		
		String temp="";
		
		/*
		 * enhanced for 
		 * extended for
		 * for each
		 */
		for(String word:words)
		{
			System.out.println(word);
		}
		
			
	}
}
