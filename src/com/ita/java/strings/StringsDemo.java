package com.ita.java.strings;

public class StringsDemo {
	
	public static void main(String[] args) {
		String str = new String("abc");
		System.out.println("Content of a string " + str);
		System.out.println("Address of a string---" + str.hashCode());
		
		str  = str.concat("123");
		System.out.println("Content of a string " + str);
		System.out.println("Address of a string---" + str.hashCode());
		
	}
}
