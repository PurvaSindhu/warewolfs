package com.xworkz.animal.boot;

import com.xworkz.animal.childClass.*;
import com.xworkz.animal.things.Animal;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat = new Cat();
		
		dog.name();
		dog.type();
		dog.behavior();
		dog.breed();
		dog.food();
		cat.name();
		cat.type();
		cat.behavior();
		cat.breed();
		cat.food();
	}

}
