package com.ita.java.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List ll = new LinkedList();
			
		ll.add(10);
		ll.add(0,"abcd");
		ll.add(0,"xxxx");
		ArrayListDemo.printCollections(ll);
		
		ll.remove(0);
		ArrayListDemo.printCollections(ll);
		ll.remove(ll.size()-1);
		ArrayListDemo.printCollections(ll);
		System.out.println(ll.contains("abcd"));
	
	}
}
