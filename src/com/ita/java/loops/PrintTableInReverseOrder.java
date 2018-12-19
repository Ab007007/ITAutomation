package com.ita.java.loops;

import java.util.Scanner;

public class PrintTableInReverseOrder {

	public static void main(String[] args) {
		System.out.println("Printing tables in reverse order");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer...");
		int num = sc.nextInt();
		
		for(int i = 20; i>=1 ; i--)
		{
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
