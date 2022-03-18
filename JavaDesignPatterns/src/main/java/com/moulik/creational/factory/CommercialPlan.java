package com.moulik.creational.factory;

public class CommercialPlan extends Plan {

	@Override
	void getRate() {
		rate=7.50;
	}

	@Override
	void getName() {
		name = "COM";
	}
	
}
