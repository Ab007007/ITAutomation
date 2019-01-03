package com.ita.java.exceptions;

public class BalanceInsufficientException extends Exception
{

	public BalanceInsufficientException() {
		// TODO Auto-generated constructor stub
		System.out.println("Balance is tooooo lowwww");
	}
	
	public BalanceInsufficientException(int balance)
	{
		System.out.println("Please enter the amount with in " + balance);
	}
	
	
	@Override
	public String getMessage() {
		return "Boss, check your balance before withdraw";
	}
}
