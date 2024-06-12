package com.xworkz.autoMobiles.boot;

import com.xworkz.autoMobiles.bridge.AutoMobiles;
import com.xworkz.autoMobiles.things.TravelAgiency;

public class AutoMobileRunner {
	
	public static void main (String [] args) {
		TravelAgiency agiency= new AutoMobiles();
		
		agiency.modeOfTransport();
		agiency.numberOfVehicals();
		agiency.symbol();
		agiency.numberOfCars();
		agiency.costumerCare();
		agiency.branches();
		agiency.bookingsOpen();
		agiency.ticketsPrice();
		agiency.priceDrop();
		agiency.agiencyName();
		
	}

}
