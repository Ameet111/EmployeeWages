package com.bridgelabz;

public class UC1_EmployeeWages {
	public static void main(String[] args) {

		// Constants
		int IS_FULL_TIME = 1;

	
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
		   System.out.println("Employee is Present");
		else
		   System.out.println("Employee is Abscent");
		}
}