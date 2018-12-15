package com.ita.java.methods;

public class DogWithParameters {

	int eyes = 2;
	int legs = 4;
	
	void colorOfADog(String color)
	{
		System.out.println("Executing ----colorOfADog");
		System.out.println("dog is "+ color + " in color");
		System.out.println("colorOfADog -END***********************");
	}
	
	void doesItRun()
	{
		System.out.println("Executing -----doesItRun");
		System.out.println("my dog has " + eyes + " eyesssssssssss");
		System.out.println("Yes.., Pretty Fast it Run");
	//	System.out.println(food);
		System.out.println("doesItRun--END********************");
	}
	
	void foodItEat() {
		System.out.println("Executing -----foodItEat");
		System.out.println("my dog has " + eyes + " eyessssssssss");
		String food="pure non-veg";
		System.out.println(food);
		System.out.println("foodItEat---END**************");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main stared...");
		DogWithParameters d = new DogWithParameters();
		d.colorOfADog("white");
		
		DogWithParameters d2 = new DogWithParameters();
		d2.colorOfADog("brown");
		System.out.println("main ended...");
		
	}
	
	
}
