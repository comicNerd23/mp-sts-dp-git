package com.moulik.creational.factory;

public abstract class Plan {
	
	protected String name = "";
	protected double rate;

	abstract void getRate();
	abstract void getName();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}

}
