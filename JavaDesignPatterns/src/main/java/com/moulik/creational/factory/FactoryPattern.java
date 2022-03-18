package com.moulik.creational.factory;

/**
 * A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an 
 * object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create
 * the instance of the class.
 *
 * Advantages:
 *	allows the sub-classes to choose the type of objects to create.
 *	promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means 
 *	the code interacts solely with the resultant interface or abstract class, so that it will work with any classes 
 * 	that implement that interface or that extends that abstract class.
 *
 * Usage
 * 	When a class doesn't know what sub-classes will be required to create
 * 	When a class wants that its sub-classes specify the objects to be created.
 * 	When the parent classes choose the creation of objects to its sub-classes.
 * 
 */
public class FactoryPattern {

	public static void main(String[] args) {
		
		

	}

}
