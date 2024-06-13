package com.xworkz.cars.bridge;

import com.xworkz.cars.things.ThorJeep;

public class Car implements ThorJeep {

	@Override
	public void rangeRover() {
		System.out.println("this is RR method");
		
	}

	@Override
	public void ferrari() {
		System.out.println("this is ferrari method");
		
	}

	@Override
	public void modalFerrari() {
		System.out.println("the car modal ferrari");
		
	}

	@Override
	public void engineFerrari() {
		System.out.println("this engine ferrari");
		
	}

	@Override
	public void bmw() {
		System.out.println("this bwm method");
		
	}

	@Override
	public void modalBMW() {
		System.out.println("this modal is bmw ");
	}

	@Override
	public void tyreBMW() {
		System.out.println("this is bmw tyre");
	}

	@Override
	public void engineBMW() {
		System.out.println("this is bmw engine");
	}

	@Override
	public void gearBMW() {
		System.out.println("this is gear of bmw");
	}

	@Override
	public void carAudi() {
		System.out.println("this is car Audi");
	}

	@Override
	public void modal1Audi() {
		System.out.println("this is Audi car modal");
	}

	@Override
	public void tyreAudi() {
		System.out.println("this is Audi tyre");
	}

	@Override
	public void engineAudi() {
		System.out.println("this is audi engine");
	}

	@Override
	public void gearAudi() {
		System.out.println("this is gear audi");
	}

	@Override
	public void blackCar() {
		System.out.println("this is thor black car");
	}
	@Override
	public static String engine() {
		String modal="range rover";
		System.out.println("this is a static method"+modal);
		return modal;
	}
	@Override
	public static int numberOfCars() {
		int cars=5;
		System.out.println("this is RR class="+cars);
		return cars;
	}

}
