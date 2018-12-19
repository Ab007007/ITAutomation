package com.ita.java.loops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Integer number for which you want to generate a Table");
		int num=sc.nextInt();;
		System.out.println("Printing a Tables...for" + num);
		
		for (int i = 1; i <= 20; i++)
		{
			System.out.println(num + " * " + i + " = " + (num*i));
			
		}
	}
	
}
