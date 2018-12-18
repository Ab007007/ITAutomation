package com.ita.java.accessspecifiers.pack2;

import com.ita.java.accessspecifiers.pack1.Test1;

public class Test4 extends Test1
{

	public static void main(String[] args) {
		Test4 t4 = new Test4();
		System.out.println(t4.protectedVariable);
		System.out.println(t4.publicVariable);
		
	}
}
