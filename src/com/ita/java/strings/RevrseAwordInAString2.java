package com.ita.java.strings;

public class RevrseAwordInAString2 {

	public static void main(String[] args) {
		String str = "Hi welcome to word reverse";
		
		String[] words = str.split(" ");
		
		String temp="";
		String word=null;
		for(int i = 0 ;  i<words.length;i++)
		{
			word = words[i];
			for (int ix = word.length()-1; ix >=0; ix--) 
			{
				temp = temp + word.charAt(ix);
			}
			temp = temp + " ";
		}
		System.out.println(str);
		System.out.println(temp);
		
	}
}
