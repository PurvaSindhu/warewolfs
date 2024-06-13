package com.xworkz.cars.things;

public interface RangeRover extends Ferrari{
	
	public void rangeRover();
	default void modalRR() {
		System.out.println("this is arange rover modal");
	}
	public static String engine() {
		String modal="range rover";
		System.out.println("this is a static method"+modal);
		return modal;
	}

}
