package com.ita.java.conditionaldemo;

import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class SwitchDemoNum {

	public static void main(String[] args) {
		System.out.println("Welcome to switch demo..");
		System.out.println("Please enter the Score");
		Scanner sc =null;
		sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch(score)
		{
			case 80:
			case 90:
				System.out.println("score is in beweeen 80 and 90");
				break;
		
		}
		
		
		
		
	}
}
