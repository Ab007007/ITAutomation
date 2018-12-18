package com.ita.java.accessspecifiers.pack1;

public class Test1 {

	private int privateVariable=0;
	int defaultVariable=1;
	protected int protectedVariable=2;
	public int publicVariable=3;
	
	
	public static void main(String[] args) {
		Test1 tq = new Test1();
		System.out.println(tq.privateVariable);
		System.out.println(tq.defaultVariable);
		System.out.println(tq.protectedVariable);
		System.out.println(tq.publicVariable);
	}
}
