package com.ita.java.variables;

public class FinalDemo {

	final static double pi = 3.142;
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.areaOfCircle(2);
		fd.areaOfCircle(3);
		fd.areaOfCircle(4);
		
	}
	
	
	void areaOfCircle(double r)
	{
		System.out.println("find the area of a circle  for the radius " + r);
		double areaOfCircle = pi * r * r;
		System.out.println("Area of a circle is : " + areaOfCircle);
	}
	
	void areaOfCircle(int r)
	{
		System.out.println("find the area of a circle  for the radius " + r);
		double areaOfCircle = pi * r * r;
		System.out.println("Area of a circle is : " + areaOfCircle);
	}
}
