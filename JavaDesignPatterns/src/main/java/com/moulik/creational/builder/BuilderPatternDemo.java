package com.moulik.creational.builder;

/**
 * Builder Pattern says that "construct a complex object from simple objects using step-by-step approach".
 * It is mostly used when object can't be created in single step like in the de-serialization of a complex object.
 * 
 * Advantages:
 * 	It provides clear separation between the construction and representation of an object.
 * 	It provides better control over construction process.
 * 	It supports to change the internal representation of objects.
 * 
 * Disadvantages
 * 	In order to create an object, you must first create its builder. While the cost of creating this builder is unlikely to be noticeable in practice, it could
 * 	be a problem in performance-critical situations. 
 * 	It is more verbose than the telescoping constructor pattern, so it should be used only if there are enough parameters to make it worthwhile, say four or more.
 *	Still, it’s often better to start with a builder in the first place.
 *
 *	
 *
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {

			NutritionFacts cocaCola = 
					new NutritionFacts.Builder(240, 4)
						.calories(100)
						//.fat(0)		No need to give this optional parameter since it is not there
						.sodium(35)
						.carbohydrate(27)
						.build();
					
	}

}
