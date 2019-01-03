package com.ita.java.threads;

public class RunnableOddNumbers implements Runnable
{

	public void run() {
		// TODO Auto-generated method stub
				printNumbers();
	}

	private  synchronized void printNumbers() {
		System.out.println("Printing Even numbers..");
		for(int i =2;i<=100;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			i++;
		}
	}

}
