package com.java.ControlStatements;

//Java Program to demonstrate the use of Nested If Statement.    
public class nestedIf {
	
	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 22;
		int weight = 56;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}
}