package com.ita.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set set = new HashSet();
		//Set set = new LinkedHashSet<>();
		Set set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(300);
		set.add(40);
		System.out.println("total size of set..." + set.size());
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
	}
	
}
