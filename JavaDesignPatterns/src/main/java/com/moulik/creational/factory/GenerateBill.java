package com.moulik.creational.factory;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		PlanFactory planFactory = new PlanFactory();

		System.out.print("Enter the name of plan for which the bill will be generated: ");
		Scanner sc = new Scanner(System.in);

		String planName = sc.next();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = sc.nextInt();

		Plan p = planFactory.getPlan(planName);
		
		//call getRate() method and calculateBill()method of DomesticPaln.
		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);
		
		sc.close();
	}

}
