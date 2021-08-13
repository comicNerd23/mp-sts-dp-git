package com.moulik.behavioral.strategy;

import java.util.Scanner;

/**
 * A Strategy Pattern says that "define a family of functionality, encapsulate each one, and make them interchangeable"
 * 
 * Advantages:
 * 	It provides a substitute to subclassing.
 * 	It defines each behavior within its own class, eliminating the need for conditional statements.
 * 	It makes it easier to extend and incorporate new behavior without changing the application.
 * 
 * Usage:
 * 	When the multiple classes differ only in their behaviors.e.g. Servlet API.
 * 	It is used when you need different variations of an algorithm.
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the first value: ");  
        float value1 = sc.nextFloat();
        System.out.print("Enter the second value: ");  
        float value2 = sc.nextFloat(); 
        Context context = new Context(new Addition());          
        System.out.println("Addition = " + context.executeStrategy(value1, value2));  

        context = new Context(new Subtraction());       
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));  

        context = new Context(new Multiplication());        
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2));  
	
	}

}
