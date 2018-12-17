package com.ita.java.constructors;

public class EmployeeManager
{

	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		System.out.println(emp1.employeeName); //null
		
		emp1.employeeName="Aravinda";
		emp1.employeeEmail="abc@pqr.com";
		emp1.employeeID="ABCD123";
		emp1.age=33;
		emp1.phoneNumber=12312;
		emp1.country="India";
		
		Employee emp2 = new Employee();
		emp2.employeeName="XYZZ";
		emp2.employeeEmail="abc@pqr.com";
		emp2.employeeID="XYZ123";
		emp2.age=44;
		emp2.phoneNumber=12312;
		emp2.country="India";
		
		System.out.println(emp1);
		System.out.println(emp2);
		
	}
}
