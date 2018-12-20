package com.ita.java.strings;

public class SubStingDemo {

	public static void main(String[] args) {
		String str = "name=aravind;age=35;phone=12345678";
		
		String[] keyValues = str.split(";");
		String tempKV="";
		String value=null;
		for(int i =0 ; i<keyValues.length;i++)
		{
			tempKV = keyValues[i];
			value = tempKV.substring(tempKV.indexOf("=")+1, tempKV.length());
			System.out.println(value);
		}
		System.out.println(str.contains("aravind"));
	}
}
