package com.ita.java.loops;

public class PrintTable {

	public static void main(String[] args) {
		int num=8;
		System.out.println("Printing a Tables...for" + num);
		
		for (int i = 1; i <= 20; i++)
		{
			System.out.println(num + " * " + i + " = " + (num*i));
			
		}
	}
	
}
