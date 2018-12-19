package com.ita.java.loops;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String choice = null;
		//nested loop - loop inside a loop
		do {
			System.out.println("Please enter integer...");
			int num = sc.nextInt();
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			
			System.out.println("do you want to continue..,??? press yes");
			choice = sc.next();
		} while (choice.equals("yes"));
		
		System.out.println("Main method is ended");
	}
}
