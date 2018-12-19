package com.ita.java.conditionaldemo;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to switch demo..");
		System.out.println("Please enter the Grade");
		Scanner sc =null;
		sc = new Scanner(System.in);
		String grade = sc.next();

		switch (grade)
		{
			case "A":
				System.out.println("Score ranges from 80-100");
				break;
			case "B":
				System.out.println("Score ranges from 60-80");			
				break;
			case "C":
				System.out.println("Score ranges from 40-60");
				break;
			case "D":
				System.out.println("Just PASS");
				break;

			default:
				System.out.println("FAIL");
				break;
		}
		
	}
}
