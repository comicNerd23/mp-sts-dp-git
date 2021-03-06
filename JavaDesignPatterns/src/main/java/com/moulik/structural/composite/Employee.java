package com.moulik.structural.composite;

public interface Employee {
	
	int getId();
	String getName();
	double getSalary();
	void print();
	void add(Employee e);
	void remove(Employee e);
	Employee getChild(int e);
}
