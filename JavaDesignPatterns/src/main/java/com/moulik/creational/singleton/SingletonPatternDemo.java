package com.moulik.creational.singleton;

/**
 * 	Singleton Pattern says that just "define a class that has only one instance and provides a global point of access to it".
 * 
 *	Advantage: Saves memory because object is not created at each request. Only single instance is reused.
 *	Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.
 *
 *	There are two forms of singleton design pattern:
 *	Early Instantiation: creation of instance at load time.
 *	Lazy Instantiation: creation of instance when required.
 *
 *	If singleton class is Serializable, you can serialize the singleton instance. Once it is serialized, you can deserialize it but it will not return the 
 *	singleton object. To resolve this issue, you need to override the readResolve() method that enforces the singleton. It is called just after the object is 
 *	deserialized. It returns the singleton object.
 *
 *	public class A implements Serializable {  
 *	//your code of singleton  
 *       protected Object readResolve() {  
 *           return getA();  
 *       }  
 *   } 
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		Logging log = Logging.getInstance();
		log.log("Inside SingletonPattern logging");
		
	}

}
