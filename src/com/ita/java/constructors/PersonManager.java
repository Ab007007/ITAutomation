package com.ita.java.constructors;

public class PersonManager {

	public static void main(String[] args) {
		Person p = new Person("Aravinda","Bangalore");
		Person p2 = new Person("Ravi","Mangalore");
		
		Person p3 = new Person();
		
		System.out.println(p);
		System.out.println(p2);
		System.out.println(p3);
	}
}

