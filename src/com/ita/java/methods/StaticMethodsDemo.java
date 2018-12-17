package com.ita.java.methods;

public class StaticMethodsDemo {
	
	public static void main(String[] args) {
		StaticMethodsDemo.addTwoNumbers(2, 2);
		System.out.println(StaticMethodsDemo.addTwoNumbers("A", "B"));
			
	}
	
	//Function definiton
	public static int addTwoNumbers(int a , int b)
	{
		int c = 0;
		c = a + b ;
		System.out.println("Sum of two numbers is " + c);
		return c;
	}
	public static  int addTwoNumbers(int a , int b, int a1)
	{
		int c = 0;
		c = a + b ;
		System.out.println("Sum of two numbers is " + c);
		return c;
	}
	
	public static double addTwoNumbers(double a, double b)
	{
		double d = 0.0;
		d = a + b;
		return d;
		
	}
	
	public static String addTwoNumbers(String a, String b)
	{
		String d = null;
		d = a + b;
		return d;
		
	}
	
	
}
