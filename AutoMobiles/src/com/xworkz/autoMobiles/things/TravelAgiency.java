package com.xworkz.autoMobiles.things;

public interface TravelAgiency {
	
	default void modeOfTransport() {
		System.out.println("this mode is walk by legs");
	}
	default int numberOfVehicals() {
		int vehical=50;
		System.out.println("the number of vehicals are="+vehical);
		return vehical;
	}
	default char symbol() {
		char logo='s';
		System.out.println("the logo is="+logo);
		return logo;
	}
	default byte numberOfCars() {
		byte cars=100;
		System.out.println("the number of cars="+cars);
		return cars;
	}
	default long costumerCare() {
		long care=100132456789l;
		System.out.println("the number of cars="+care);
		return care;
	}
	default short branches() {
		short total=150;
		System.out.println("the number of cars="+total);
		return total;
	}
	default boolean bookingsOpen() {
		boolean open=true;
		System.out.println("the number of cars="+open);
		return open;
	}
	default double ticketsPrice() {
		double tickets=1234.543267d;
		System.out.println("the price of ticket is="+tickets);
		return tickets;
	}
	default float priceDrop() {
		float drop=50.13245f;
		System.out.println("the price drop is="+drop);
		return drop;
	}
	default String agiencyName() {
		String name="suguma travels";
		System.out.println("the agency name is="+name);
		return name;
	}
	
}
