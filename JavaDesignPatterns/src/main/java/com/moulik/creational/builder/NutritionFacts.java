package com.moulik.creational.builder;

/**
 * Creating NutritionFacts constructors with Builder Pattern
 * 
 * Instead of making the desired object directly, the client calls a constructor (or static factory) with all of the 
 * required parameters and gets a builder object. Then the client calls setter-like methods on the builder object to set 
 * each optional parameter of interest. Finally, the client calls a parameterless build method to generate the object, 
 * which is typically immutable. The builder is typically a static member class (Item 24) of the class it builds.
 *
 * Validity checks were omitted for brevity. To detect invalid parameters as soon as possible, check parameter validity
 * in the builder’s constructor and methods.
 * Check invariants involving multiple parameters in the constructor invoked by the build method. To ensure these 
 * invariants against attack, do the checks on object fields after copying parameters from the builder (Item 50). If a 
 * check fails, throw an IllegalArgumentException (Item 72) whose detail message indicates which parameters are invalid 
 * (Item 75).
 */
public class NutritionFacts {
	
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	//Nested Static Class
	public static class Builder {
		
		//Required Parameters
		private final int servingSize;
		private final int servings;
		
		//Optional Parameters
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		//Builder constructor for required parameters
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		//setters for optional parameters
		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}
		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}
		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}
		public Builder carbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
		
	}
	
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}
	
}
