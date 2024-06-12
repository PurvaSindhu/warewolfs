package com.xworks.bikes.boot;

import com.xworks.bikes.bridge.PulsarBike;
import com.xworks.bikes.things.Bike;

public class BikeRunner {
	
	public static void main(String [] args) {
		Bike bike = new PulsarBike();
		
		bike.bike();
		bike.numberOftyres();
		bike.indentity();
		bike.numberOfGears();
		bike.costumerCare();
		bike.breaks();
		bike.Price();
		bike.discount();
		bike.bikeName();
		bike.bookingsOpen();
		
			
	}

}
