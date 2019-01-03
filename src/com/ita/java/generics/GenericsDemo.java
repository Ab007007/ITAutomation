package com.ita.java.generics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.ita.java.collections.ArrayListDemo;

public class GenericsDemo {

	public static void main(String[] args) {
	//	List<Integer> al = new ArrayList<Integer>();
		Set<Integer> al = new LinkedHashSet<Integer>();
		al.add(5000);
		al.add(20);
		al.add(300);
		printSet(al);
		System.out.println("main ended...");
		
	}
	
	public static void printSet(Set s)
	{
		Iterator<Integer> it =  s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
}
