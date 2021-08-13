package com.moulik.creational.prototype;

import java.util.Scanner;

/**
 * Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.
 * 
 * This pattern should be followed, if the cost of creating a new object is expensive and resource intensive
 * 
 * Advantages:
 * 	It reduces the need of sub-classing.
 * 	It hides complexities of creating objects.
 *	The clients can get new objects without knowing which type of object it will be.
 *	It lets you add or remove objects at runtime.
 * 
 * Usage:
 * 	When the classes are instantiated at runtime.
 * 	When the cost of creating an object is expensive or complicated
 * 	When you want to keep the number of classes in an application minimum.
 * 	When the client application needs to be unaware of object creation and representation.
 */
public class PrototypePattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id: ");
		int eid = sc.nextInt();
		System.out.print("\n");

		System.out.print("Enter Employee Name: ");
		String ename = sc.next();
		System.out.print("\n");

		System.out.print("Enter Employee Designation: ");
		String edesignation = sc.next();
		System.out.print("\n");

		System.out.print("Enter Employee Address: ");
		String eaddress = sc.next();
		System.out.print("\n");

		System.out.print("Enter Employee Salary: ");
		double esalary = sc.nextDouble();
		System.out.print("\n");

		EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);

		e1.showRecord();
		System.out.println("\n");
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
		e2.showRecord();
	}

}
