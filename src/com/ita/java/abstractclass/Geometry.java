package com.ita.java.abstractclass;

public abstract class Geometry {

	 //method without body - 
	//method declaration
	abstract void draw();
	abstract void sketch();
	
	void printInfo()
	{
		System.out.println("i'm printing from Geometry class...");
	}
	
}
