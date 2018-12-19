package com.ita.java.conditionaldemo;

import java.util.Scanner;

public class GreatestofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3=0;
		System.out.println("Please enter the numbers");
		System.out.println("fist number");
		num1= sc.nextInt();
		System.out.println("second number");
		num2= sc.nextInt();
		System.out.println("third number");
		num3= sc.nextInt();
		// 2 1 3 
		if(num1>num2 && num1>num3)
		{
			System.out.println("first number is the greatest");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("second number is greater..");
		}
		else
		{
			System.out.println("third number is grater..");
		}
		
	}
}
