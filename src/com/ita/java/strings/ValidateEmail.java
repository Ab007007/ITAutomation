package com.ita.java.strings;

import java.util.Scanner;

public class ValidateEmail {

	public static void main(String[] args) {
		/*
		 * 1. email should contain only one @
		 * 2. should end with .com or .co.in
		 */
		
		Scanner sc = new Scanner(System.in);
		String choice = null;
		String id =null;
		do
		{
			System.out.println("Please enter the email id");
			id = sc.next();
			
			if((id.indexOf("@")==id.lastIndexOf("@")) && id.indexOf("@")!=-1)
			{
				System.out.println("Valid Email ID with one @");
				if(id.endsWith(".com") || id.endsWith("co.in"))
				{
					System.out.println("valid with .com/co.in");
				}
				else
				{
					System.out.println("invalid id , not end with .com or co.in");
				}
			}
			else
			{
				System.out.println("Please enter a valid email id");
			}
			
			System.out.println("do you want to continue//, press YES");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("main Ended");	
	}
}
//while(choice.toLowerCase().equals("yes"));