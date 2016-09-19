/*****************************************************************/
/* Copyright 2013 Code Strategies                                */
/* This code may be freely used and distributed in any project.  */
/* However, please do not remove this credit if you publish this */
/* code in paper or electronic form, such as on a web site.      */
/*****************************************************************/

package abstractFactory.animals;

import abstractFactory.animals.Animal;
import abstractFactory.animals.Cat;
import abstractFactory.animals.Dog;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else {
			return new Cat();
		}
	}

}
