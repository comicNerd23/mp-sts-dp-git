package com.moulik.creational.singleton;

/**
 * Creating a Singleton instance of Logging since it is created only once and used everywhere.
 * 
 * To create the singleton class, we need to have static member of class, private constructor and static factory method.
 */
public class Logging {

	// private static Logging obj = new Logging(); //Early, instance will be created at load time
	private static Logging lazyObj;

	private Logging() {
	}

	public static Logging getInstance() {
		// return obj;		Uncomment this line and comment the complete code below for early instantiation of singleton

		if (lazyObj == null) {
			synchronized (Logging.class) {
				if (lazyObj == null) {
					lazyObj = new Logging();// instance will be created at request time
				}
			}
		}
		
		return lazyObj;
	}

	public void log(String s) {
		System.out.println("Log:"+s);
	}
	
	public void doSomething() {
		System.out.println("doing Something in Logging");
	}

}
