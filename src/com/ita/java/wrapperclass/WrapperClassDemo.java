package com.ita.java.wrapperclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		String str = "105";
		Integer it = new Integer(str);
		int value = it.intValue();
		
		System.out.println("String : " + str);
		System.out.println("Integer : " + it);
		System.out.println("int : " + value);
		
		System.out.println("Adding 10 " + (str+10)); //10510
		System.out.println("Adding 10 " + (it+10)); //115
		System.out.println("Adding 10 " + (value+10)); //115
		
		
		
		
		/*int i=105;
		String str = "105";
		System.out.println(i);
		
		Integer intObj1 = new Integer(i); 
		Integer intObj2 = new Integer(str);
		
		if(intObj1.equals(intObj2))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}*/
	}
}
