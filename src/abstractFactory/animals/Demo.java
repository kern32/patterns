/*****************************************************************/
/* Copyright 2013 Code Strategies                                */
/* This code may be freely used and distributed in any project.  */
/* However, please do not remove this credit if you publish this */
/* code in paper or electronic form, such as on a web site.      */
/*****************************************************************/

package abstractFactory.animals;

public class Demo {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
		Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
		System.out.println("a1 sound: " + a1.makeSound());
		Animal a2 = speciesFactory1.getAnimal("snake");
		System.out.println("a2 sound: " + a2.makeSound());

		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
		Animal a3 = speciesFactory2.getAnimal("dog");
		System.out.println("a3 sound: " + a3.makeSound());
		Animal a4 = speciesFactory2.getAnimal("cat");
		System.out.println("a4 sound: " + a4.makeSound());
	}
}
