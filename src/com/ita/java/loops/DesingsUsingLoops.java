package com.ita.java.loops;

import java.util.Scanner;

public class DesingsUsingLoops 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number to generate a Pattern...");
		//initiaizing all variables or obj ref to a default value
		Scanner sc = null;
	
		int num =0;
		// assigning a value to the variables or obj ref
		sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) 
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
