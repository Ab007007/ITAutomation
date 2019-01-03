package com.ita.java.exceptions;

import java.util.Scanner;

public class ThrowDemo {

	static int balance =5000;
	public static void main(String[] args) {
		System.out.println("Welcome to Debit ****");
		String choice=null;
		int tempBalance;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Please enter the amount");
			int withDraw = sc.nextInt();
			
			tempBalance = balance-withDraw;
			if(tempBalance<=0) {
				try
				{
					throw new BalanceInsufficientException();
				}
				catch(BalanceInsufficientException ex)
				{
					System.out.println("enter amount with in " + balance);
					System.out.println(ex.getMessage());
				}
			}
			else
			{
				balance = tempBalance;
			}
			System.out.println("do you want one more transaction ");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
	}
}
