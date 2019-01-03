package com.ita.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		//super class obj ref can be assigned to subclass obj
		
		List al = new ArrayList();
		al.add(1);
		al.add("TWO");
		al.add(3.3);
		al.add('A');
		al.add(true);
	
				
		printCollections(al);
		
		al.add(1, "xxxxxxxxxxxxxxx");
		printCollections(al);
		
		al.remove(3);
		printCollections(al);
		
		
		
	}

	public  static void printCollections(List al) 
	{
		System.out.println("*******************************");
		System.out.println("size of an arraylist :" + al.size());
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("################################");
	}
	/*public  static void printCollections(List al) {
		System.out.println("*******************************");
		System.out.println("size of an arraylist :" + al.size());
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("Element at "+ i + " index " + al.get(i));
		}
	}*/
}
