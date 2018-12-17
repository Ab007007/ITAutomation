package com.ita.java.constructors;

public class Employee 
{

	//ALL THE GLOBAL VARIABLES ARE INITIALIZED BY COMPILER WITH DEFAULT VALUE 
	//BASED ON THE DATA TYPE
	String employeeName;
	String employeeID;
	String employeeEmail;
	int age;
	long phoneNumber;
	static final String companyName="IBM";
	String country;
	
	
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("*****************Printing Values inside an Object ********************");
		String str = null;
		
		str = "Employee Name " + this.employeeName + "\nEmployee Email " + this.employeeEmail
				+ "\nEmployee Age" + this.age + "\nEmployee ID" + this.employeeID 
				+ "\nEmployee Company " + Employee.companyName + "\nEmployee Country " + this.country;
		
		
		return str;
	}
	
	
}
