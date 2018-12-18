package com.ita.java.inheritence;

public class Animal {

	int legs=4;
	int eyes=2;
	
	public void eat()
	{
		System.out.println("Animal always eat veg and nonveg");
	}
	
	
	public void drink()
	{
		System.out.println("always drink plenty of water");
	}
	
	public final void onlyAnimal()
	{
		System.out.println("i'm only in animal class.. :(");
	}
}
