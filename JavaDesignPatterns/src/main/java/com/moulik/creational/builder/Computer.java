package com.moulik.creational.builder;

/**
 * 1. Create Main outer class with fields and getters and a private constructor that takes in Builder object and uses this
 * builder object to set the fields.
 * 
 * Create the main class like Computer with private required and optional parameters. This class will have only 
 * public getters, no setters and private constructor with Builder argument. This constructor's task is to set the internal
 * field using fields from builder.
 * 
 * 2. Create static nested class called Builder with same fields.
 * 
 * First of all you need to create a static nested class and then copy all the arguments from the outer class to the
 * Builder class. We should follow the naming convention and if the class name is Computer then builder class should be
 * named as ComputerBuilder.
 * 
 * 3. In Builder, create a public constructor with required fields 
 * 
 * Java Builder class should have a public constructor with all the required attributes as parameters.
 * 
 * 4. In Builder, create setter methods for optional parameters which return same Builder
 * 
 * Java Builder class should have methods to set the optional parameters and it should return the same Builder object
 * after setting the optional attribute.
 * 
 * 5. In Builder, create build() which returns private constructor containing builder object
 * 
 * The final step is to provide a build() method in the builder class that will return the Object needed by client 
 * program. For this we need to have a private constructor in the Class with Builder class as argument.
 */
public class Computer {

	//STEP 1
	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	// STEP 2: Builder Class
	public static class ComputerBuilder {

		// STEP 2: required parameters
		private String HDD;
		private String RAM;

		// STEP 2: optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		// STEP 3: Public Constructor
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		//STEP 4: Create setters that return this object
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		//STEP 5: Create build() which returns private constructor containing builder object
		public Computer build() {
			return new Computer(this);
		}

	}

}
