package com.ita.java.conditionaldemo;

import java.util.Scanner;

public class FindGreaterNumber {

	public static void main(String[] args) {
		Scanner sc = null;
		int a , b =0;
		String choice = null;
		sc = new Scanner(System.in);
		do
		{
			System.out.println("Please enter the numbers...");
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a>b)
			{
				System.out.println("first number is greater ");
			}
			else if(b>a)
			{
				System.out.println("second number is greater");
			}
			else
			{
				System.out.println("Both are same!!!!!");
			}
			System.out.println("do you want to cont..? press 'y'");
			choice = sc.next();
		}while(choice.equals("y"));
		
		System.out.println("main ended");
	}
}
