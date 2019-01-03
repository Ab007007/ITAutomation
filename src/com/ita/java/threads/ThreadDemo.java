package com.ita.java.threads;

public class ThreadDemo {
//Print odd numbers and even numbers from 1-100
	public static void main(String[] args) 
	{
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		System.out.println("Printing odd numbers...");
		for (int i = 1; i <= 100; i++) 
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("Printing even numbers...");
		for (int i = 2; i <= 100; i++) 
		{
			System.out.println(i);
			i++;
		}
		
		
		
	}
	
}
