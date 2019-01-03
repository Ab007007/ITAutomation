package com.ita.java.threads;

public class RunnableEvenNumber implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Printing Even numbers..");
		for(int i =2;i<=100;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			i++;
		}
	}

}
