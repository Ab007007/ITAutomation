package com.ita.java.threads;

public class RunnableManager {

	public static void main(String[] args) throws InterruptedException {
		RunnableOddNumbers rOn = new RunnableOddNumbers();
		RunnableEvenNumber rEn = new RunnableEvenNumber();
		
		Thread t1 = new Thread(rOn);
		Thread t2 = new Thread(rOn);
		
//		Thread t3 = new Thread(rEn);
//		Thread t4 = new Thread(rEn);
//		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
//		t3.start();
//		t4.start();
////		
		System.out.println("Ending main method...");
	}
}
