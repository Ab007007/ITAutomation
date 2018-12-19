package com.ita.java.conditionaldemo;

import java.util.Scanner;

public class OddNumberDemo {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int cont=0;
		do
		{
			System.out.println("Please enter the number ");
			int num = sc.nextInt();
			
			if((num % 2)==0)
			{
				System.out.println("number is even");
			}
			else
			{
				System.out.println("number is odd");
			}
			System.out.println("press 1 to continue...");
			cont = sc.nextInt();
		}while(cont==1);
			
	}
}
