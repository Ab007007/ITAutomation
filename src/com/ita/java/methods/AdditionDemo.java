package com.ita.java.methods;

public class AdditionDemo {
	
	public static void main(String[] args) {
		AdditionDemo ad = new AdditionDemo();
		int c = ad.addTwoNumbers(3, 3);
		System.out.println(c + " is the output of function");
		
		System.out.println("The sum of two numbers is " + ad.addTwoNumbers(20, 20));
		System.out.println("Addition of two double numbers is " + ad.addTwoNumbers(2.5, 2.5));
		System.out.println("Addition of two String values " + ad.addTwoNumbers("A", "B"));
			
	}
	
	//Function definiton
	public int addTwoNumbers(int a , int b)
	{
		int c = 0;
		c = a + b ;
		System.out.println("Sum of two numbers is " + c);
		return c;
	}
	public int addTwoNumbers(int a , int b, int a1)
	{
		int c = 0;
		c = a + b ;
		System.out.println("Sum of two numbers is " + c);
		return c;
	}
	
	public double addTwoNumbers(double a, double b)
	{
		double d = 0.0;
		d = a + b;
		return d;
		
	}
	
	public String addTwoNumbers(String a, String b)
	{
		String d = null;
		d = a + b;
		return d;
		
	}
	
	
}
