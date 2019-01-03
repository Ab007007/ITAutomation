package com.ita.java.exceptions;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("main started");
		Scanner sc = new Scanner(System.in);
		String str = "abcd efg hij klm";
		try
		{
			System.out.println("Please enter the index..");
			int num = sc.nextInt();
			System.out.println(str.charAt(num));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("[--FAIL--]please enter the index with in " + (str.length()-1));
		}
		finally
		{
			System.out.println("finally  block executed");
			sc.close();
		}
			System.out.println("main ended");
	}
}
