package com.moulik.structural.adapter;

/**
 * An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants"
 * Idea: If you have 2 interfaces, you need 1 interface but you have another interface that provides the functionality that
 * you want, then you can adapt that interface to your liking.
 * 
 * Advantages:
 * 	It allows two or more previously incompatible objects to interact.
 * 	It allows re-usability of existing functionality.
 *
 * Uses:
 * 	When an object needs to utilize an existing class with an incompatible interface.
 * 	When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
 * 
 * Consider that we have a Logger which can log. It can log to different places, e.g to console, to files etc.
 * This Logger is dependent on another interface, e.g LogWriter.out(String text);
 * Now We have another class whose sole purpose is to write to console, ConsoleWriter. So it does what we want, but it just
 * not have the same interface that we are using.
 * 
 * Now to use this class, we need to adapt it to the interface which our class Logger has, ie LogWriter. 
 * There are 2 ways to achieve this:
 * By Composition: Class ConsoleLogWriter has HAS-A relationship with ConsoleWriter.
 * So we write another class ConsoleLogWriter which extends LogWriter and which has composition of ConsoleWriter.
 * 
 * By Inheritence: Class ConsoleLogWriter2 has IS-A relationship with ConsoleWriter
 * 
 *   
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		//////By Composition
		LogWriter logWriter = new ConsoleLogWriter(new ConsoleWriter());
		Logger logger = new Logger(logWriter);
		logger.write("Hello Writer");
		
		//////By Inheritance
		ConsoleLogWriter2 logWriter2 = new ConsoleLogWriter2();
		Logger logger2 = new Logger(logWriter2);
		logger2.write("Hello Writer 2");
	}

}
