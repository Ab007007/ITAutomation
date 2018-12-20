package com.ita.java.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "Hi all welcome to Strings";
		String str1 = "hi All Welcome To Strings";
		String str2 = "name=aravind;age=35;phone=12345678";

		System.out.println("index of w is " + str.indexOf("w"));
		System.out.println("index of i " + str.indexOf("i"));
		System.out.println("index of second i " + str.indexOf("i", 2));
		System.out.println("length of the string " + str.length());
		System.out.println("last index of i " + str.lastIndexOf("i"));
		System.out.println("ends with " + str.endsWith("Strings"));
		System.out.println("Lowser case " + str.toLowerCase());
		System.out.println("Upper case " + str.toUpperCase());
		
		System.out.println("Equals output " + str.equals(str1));
		System.out.println("Equals Ignore Case output " + str.equalsIgnoreCase(str1));
		
		System.out.println("is emptyr" + str.isEmpty());
		System.out.println("Char at a given index " + str.charAt(21));
		
		String[] words = str.split(" ");
		System.out.println("length of array " + words.length);
				
		for(int ix=0;ix<words.length;ix++)
		{
			System.out.println(words[ix]);
		}
		
		
		System.out.println("sub string " + str.substring(0, 10));
		System.out.println("Main Ended...");
		
		
	}
}
