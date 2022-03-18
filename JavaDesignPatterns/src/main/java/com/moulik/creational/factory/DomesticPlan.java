package com.moulik.creational.factory;

public class DomesticPlan extends Plan {

	@Override
	void getRate() {
		rate=3.50;
	}

	@Override
	void getName() {
		name = "DOM";
	}
	
}
