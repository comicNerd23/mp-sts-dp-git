package com.moulik;

/**
 * Design Patterns are well-proved solution for solving the specific problem/task. For OOP, we have some Design 
 * patterns.
 * It represents an idea that is used to solve same type of problems in the same conceptual domain (like Java).
 * One should know all design patterns but should use only that pattern which provides the best way to solve that 
 * specific problem.
 * Gangs of Four Design Patterns is the collection of 23 design patterns from the book “Design Patterns: Elements
 * of Reusable Object-Oriented Software”
 * 
 * There are 3 main types of pattern:
 * 1. Creational Patterns: concerned with the way of creating objects
 * 	Singleton: 	define a class that has only one instance and provides a global point of access to it
 * 	Factory:	define an interface or abstract class for creating an object but let the subclasses decide which class
 *  to instantiate
 * 	Abstract Factory: define an interface or abstract class for creating families of related (or dependent) objects but
 * 	without specifying their concrete sub-classes
 * 	Builder:	construct a complex object from simple objects using step-by-step approach
 * 	Protoype:	cloning of an existing object instead of creating new one and can also be customized as per the 
 * 	requirement
 * 	Object Pool: boost performance for creating objects, tradeoff is RAM. eg. String Pool and 
 * 
 * 2. Structural Patterns: concerned with the composition of an object, that is if we can use the sub-assemblies in another
 * object.
 * 	Adaptor:	converts the interface of a class into another interface that a client wants
 * 	Composite:	allow clients to operate in generic manner on objects that may or may not represent a hierarchy of 
 * 	objects
 * 	Proxy:		provides the control for accessing the original object
 * 	Flyweight:	to reuse already existing similar kind of objects by storing them and create new object when no matching
 * 	object is found
 * 	Facade:		just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it 
 *  hides the complexities of the subsystem from the client
 * 	Bridge:		decouple the functional abstraction from the implementation so that the two can vary independently
 * 	Decorator:	attach a flexible additional responsibilities to an object dynamically
 * 
 * 3. Behavioral Patterns: concerned with the behavior of objects that are doing some kind of work. That is, how can we 
 * design our program in a very efficient way so that one class knows everything it needs to know so that we do not take that
 * logic and put it in other classes. Aka Spaghetti design. Things are not in the right place.
 * 	Template Method:	just define the skeleton of a function in an operation, deferring some steps to its subclasses
 * 	Mediator:	to define an object that encapsulates how a set of objects interact
 * 	Chain Of Responsibility: avoid coupling the sender of a request to its receiver by giving multiple objects a chance
 *  to handle the request
 * 	Observer:	just define a one-to-one dependency so that when one object changes state, all its dependents are 
 *  notified and updated automatically
 * 	Strategy:	defines a family of functionality, encapsulate each one, and make them interchangeable
 * 	Command:	encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks 
 *  for the appropriate object which can handle this command and pass the command to the corresponding object and that 
 *  object executes the command
 * 	State:		the class behavior changes based on its state
 * 	Visitor:	used when we have to perform an operation on a group of similar kind of Objects.
 * 	Iterator:	to access the elements of an aggregate object sequentially without exposing its underlying 
 *  implementation
 * 	Interpreter:to define a representation of grammar of a given language, along with an interpreter that uses this 
 * 	representation to interpret sentences in the language
 * 	Memento:	to restore the state of an object to its previous state. But it must do this without violating 
 * 	Encapsulation
 * 
 * Main Principles: Composition over Inheritence and Coding to Interfaces
 *
 */
public class DesignPatterns {

}
