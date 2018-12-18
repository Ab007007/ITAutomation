package com.ita.java.constructors;

class Person
{
	String name;
	String address;
	
	Person(String name , String address)
	{
		this.name = name;
		this.address = address;
		System.out.println("Parametarized constructor is called");
	}
	
	Person()
	{
		System.out.println("Default constructor ");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " - " + this.address;
	}
}
