package com.ita.java.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		//Map mp = new HashMap<>();
		//Map mp = new LinkedHashMap<>();
		Map mp = new TreeMap<>();
		mp.put("name", "aravinda");
		mp.put("phone", "123456789");
		mp.put("address", "num.211,aldjf lsdjfakl1 dajfd ");
		//mp.size();
//		System.out.println(mp.get("name"));
//		System.out.println(mp.get("phone"));
//		System.out.println(mp.get("address"));
//		
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		String key=null;
		while(it.hasNext())
		{
			key = (String) it.next();
			System.out.println("Value stored in " + key +  " is " + mp.get(key));
		}
	}
}
