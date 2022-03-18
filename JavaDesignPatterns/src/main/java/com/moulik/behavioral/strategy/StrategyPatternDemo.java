package com.moulik.behavioral.strategy;

import java.util.Scanner;

/**
 * A Strategy Pattern says that "define a family of algorithms, encapsulate each one, and make them interchangeable". 
 * Strategy lets the algorithms vary independently from clients that use it.
 * 
 * Advantages:
 * 	It provides a substitute to sub-classing.
 * 	It defines each behavior within its own class, eliminating the need for conditional statements.
 * 	It makes it easier to extend and incorporate new behavior without changing the application.
 * 
 * Usage:
 * 	When the multiple classes differ only in their behaviors.e.g. Servlet API.
 * 	It is used when you need different variations of an algorithm.
 * 
 * In simple words, it favors Composition (Has-A) over Inheritence. (Is-A)
 * 
 * Take an example of Duck which has behaviors like quack(), fly(), display() etc. There can be WildDuck and CityDuck.
 * Let's assume there is also a RubberDuck which can't really fly. So we will have to have a fly() which is empty.
 * Instead of doing this, we should have the behavior be abstracted so that different ducks can have different concrete
 * implementations of fly(). We can just an interface IFlyStrategy which can have different concrete implementations
 * e.g noFlyStrategy(), simpleFlyStrategy. Now, in essence, we don't really need child objects since
 * 
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
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
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
