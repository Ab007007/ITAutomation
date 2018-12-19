package com.ita.java.arraysdemo;

public class ArraysDemo {

	public static void main(String[] args) {
		int marks[]= new int[6] ;
		
		marks[0]=80;
		marks[1]=90;
		marks[2]=92;
		marks[3]=97;
		marks[4]=77;
		marks[5]=85;
//		marks[6]=85;
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("element at " + i + " index " + marks[i]);
		}
		
		
		
	}
}
