package com.ita.java.inheritence;

import com.ita.java.interfacedemo.LivingThing;

public class Cow extends Animal implements LivingThing
{
	
	public void cuteAnimal()
	{
		System.out.println("cute animal which will never harm anyone");
	}

	public void givesMilk()
	{
		System.out.println("gives plenty of milk to Human beings");
	}
	
	public void eat() {
		System.out.println("Eat only Veg--Only eat Grass");
	}

	@Override
	public void canBreath() {
		// TODO Auto-generated method stub
		System.out.println("cow can breath");
		
	}

	@Override
	public void canWalk() {
		System.out.println("cow can walk slow");
		// TODO Auto-generated method stub
		
	}
}
