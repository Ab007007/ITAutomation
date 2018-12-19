package com.ita.java.loops;

import java.util.Scanner;

public class PrintTableUsingWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer \n");
		int num = sc.nextInt();
		System.out.println("Printing tables for " + num);
		int i=1;
		while(i<=20)
		{
			System.out.println(num + " * " + i + " = " + (num*i));
			i++;
		}
		System.out.println("main method is ended...");
		
	}
}
