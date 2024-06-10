package com.xworkz.animal.childClass;

import com.xworkz.animal.things.Animal;

public class Cat extends Animal {
	
	@Override
	public void name() {
		System.out.println("the name of animal is cat");
	}
	@Override
	public void type() {
		System.out.println("the type of cat is pershian cats");
	}
	@Override
	public void behavior() {
		System.out.println("the are quite in nature");
	}
	@Override
	public String breed() {
		System.out.println("the breed of the animal is "+animalBreed);
		return animalBreed;
	}
	public String food() {
		System.out.println("they feed on foods like"+foods);
		return foods;
	}


}
