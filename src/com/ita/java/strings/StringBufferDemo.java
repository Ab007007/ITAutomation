package com.ita.java.strings;

public class StringBufferDemo 
{

	public static void main(String[] args) {
		String str = "hi all welcome to string buffer";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
	//	System.out.println(sb.reverse());
		System.out.println(sb.indexOf("welcome"));
		System.out.println(sb.charAt(21));
		System.out.println(sb.substring(0, 10));
		
		System.out.println(sb.delete(0, 2));
		System.out.println(sb);
		sb.insert(0, "Hi");
		System.out.println(sb);
		
		
		
	}
	
}
