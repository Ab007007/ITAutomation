package com.ita.java.exceptions;

public class ExceptionHandlingDemo {

	public static void main(String[] args)
	{
		System.out.println("Main Started");
		int a[] = new int[2];
		a[0] = 100;
		a[1] = 101;
		
		printArray(a);
		System.out.println("Main ended..");
	}
	
	public static void printArray(int a[])
	{
		for(int i=0;i<=a.length;i++)
		{
			try
			{
				System.out.println(a[i]);
			}
			catch(ArrayIndexOutOfBoundsException aiex)
			{
				System.out.println("Exception while printing array elements-->" + aiex.getMessage() );
				aiex.printStackTrace();
				
			}
			
		}
	}
}
