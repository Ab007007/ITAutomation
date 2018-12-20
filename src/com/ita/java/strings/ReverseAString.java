package com.ita.java.strings;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "Hi How are you ????";
		
		int length = str.length();
		String temp="";
		for (int i = length-1; i >=0; i--) 
		{
			temp = temp + str.charAt(i);
		}
		System.out.println(temp);
		
	}
}
