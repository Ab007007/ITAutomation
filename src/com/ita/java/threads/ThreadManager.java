package com.ita.java.threads;

public class ThreadManager {

	public static void main(String[] args) throws InterruptedException {
		OddNumberPrinter mt = new OddNumberPrinter();
		mt.setName("OddNumber");
		EvenNumberPrinter ep = new EvenNumberPrinter();
		ep.setName("EvenNumber");
		System.out.println(" Priority " + mt.getPriority());
		mt.start();
		mt.setPriority(10);//1,5,10
		ep.start();
		for (int i = 0; i < 50; i++) {
			Thread.sleep(100);
			//mt.wa
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
		
		System.out.println("Ending main method");
		
	}
}
