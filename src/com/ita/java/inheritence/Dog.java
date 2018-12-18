package com.ita.java.inheritence;

public class Dog extends Animal 
{

	public void richAnial()
	{
		System.out.println("most of the dogs stay in Rich house");
	}
	public void bark()
	{
		System.out.println("always barks when it see new Dog");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog is eating Food....");
	}
	

}
