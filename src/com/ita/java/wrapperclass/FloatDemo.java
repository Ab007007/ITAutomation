package com.ita.java.wrapperclass;

public class FloatDemo {

	public static void main(String[] args) {
		double d =123.10;
		System.out.println("I'm Primitive data type " + d);
		Double dObj = new Double(d);
		//true or false "TRUE" "tRuE";
		System.out.println("I'm Derived data type " + dObj);
		double d1 = dObj.doubleValue();
		System.out.println("I'm Primitive data type " + d1);
	}
}
