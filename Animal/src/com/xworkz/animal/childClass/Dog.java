package com.xworkz.animal.childClass;

import com.xworkz.animal.things.Animal;

public class Dog extends Animal{
	
	@Override
	public void name() {
		System.out.println("the name of animal is dog");
	}
	@Override
	public void type() {
		System.out.println("the type of dog is dobbar man ");
	}
	@Override
	public void behavior() {
		System.out.println("the are agrressive in nature");
	}
	@Override
	public String breed() {
		System.out.println("the breed of the animal is dogs"+animalBreed);
		return animalBreed;
	}
	public String food() {
		System.out.println("they feed on foods like treats");
		return foods;
	}


}
