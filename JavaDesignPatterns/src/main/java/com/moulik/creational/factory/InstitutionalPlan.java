package com.moulik.creational.factory;

public class InstitutionalPlan extends Plan {

	@Override
	void getRate() {
		rate=5.50;
	}

	@Override
	void getName() {
		name = "INS";
	}
	
}
