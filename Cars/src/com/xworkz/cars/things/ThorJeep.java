package com.xworkz.cars.things;

public interface ThorJeep extends RangeRover{
	
	public static int numberOfCars() {
		int cars=5;
		System.out.println("this is RR class="+cars);
		return cars;
	}
	public void blackCar();
	default void modalThor() {
		System.out.println("this is a thor car");
	}

}
