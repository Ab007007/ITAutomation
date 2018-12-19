package com.ita.java.loops;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("Printing numbers from 1-10");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Main method ended here");
	}
}
