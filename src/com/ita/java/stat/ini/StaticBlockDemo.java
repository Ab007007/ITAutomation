package com.ita.java.stat.ini;

public class StaticBlockDemo {

	static int count=0;
	static
	{
		System.out.println("total objects created " );
		System.out.println("i'm static block");
	}
	
	{
		System.out.println("im instace to class, total object for my class-->" + ++count);
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		
		StaticBlockDemo sb1 = new StaticBlockDemo();
		StaticBlockDemo sb2 = new StaticBlockDemo();
		StaticBlockDemo sb3 = new StaticBlockDemo();
		StaticBlockDemo sb4 = new StaticBlockDemo();
		StaticBlockDemo sb5 = new StaticBlockDemo();
		StaticBlockDemo sb6 = new StaticBlockDemo();
		StaticBlockDemo sb7 = new StaticBlockDemo();
		StaticBlockDemo sb8 = new StaticBlockDemo();
		
	}
}
