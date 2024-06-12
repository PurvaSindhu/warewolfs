package com.xworkz.autoMobiles.bridge;

import com.xworkz.autoMobiles.things.TravelAgiency;

public class AutoMobiles implements TravelAgiency {
	
	public void modeOfTransport() {
		System.out.println("this mode is walk by legs");
	}
	public int numberOfVehicals() {
		int vehical=50;
		System.out.println("the number of vehicals are="+vehical);
		return vehical;
	}
	public char symbol() {
		char logo='s';
		System.out.println("the logo is="+logo);
		return logo;
	}
	public byte numberOfCars() {
		byte cars=100;
		System.out.println("the number of cars="+cars);
		return cars;
	}
	public long costumerCare() {
		long care=100132456789l;
		System.out.println("the number of cars="+care);
		return care;
	}
	public short branches() {
		short total=150;
		System.out.println("the number of cars="+total);
		return total;
	}
	public boolean bookingsOpen() {
		boolean open=true;
		System.out.println("the number of cars="+open);
		return open;
	}
	public double ticketsPrice() {
		double tickets=1234.543267d;
		System.out.println("the price of ticket is="+tickets);
		return tickets;
	}
	public float priceDrop() {
		float drop=50.13245f;
		System.out.println("the price drop is="+drop);
		return drop;
	}
	public String agiencyName() {
		String name="suguma travels";
		System.out.println("the agency name is="+name);
		return name;
	}
	

}
