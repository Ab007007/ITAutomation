package com.ita.java.loops;

public class PrintTableUsingWhile {

	public static void main(String[] args) {
		int num =25;
		System.out.println("Printing tables for " + num);
		int i=1;
		while(i<=20)
		{
			System.out.println(num + " * " + i + " = " + (num*i));
			i++;
		}
		
	}
}
