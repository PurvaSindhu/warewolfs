package com.xworks.bikes.bridge;

import com.xworks.bikes.things.Bike;

public class PulsarBike implements Bike{
	
	public void bike() {
		System.out.println("this is bike void");
	}
	public int numberOftyres() {
		int tyre=2;
		System.out.println("the number of tyres are="+tyre);
		return tyre;
	}
	public char indentity() {
		char logo='p';
		System.out.println("the logo is="+logo);
		return logo;
	}
	public byte numberOfGears() {
		byte gears=100;
		System.out.println("the number of gears are="+gears);
		return gears;
	}
	public long costumerCare() {
		long help=9876654321l;
		System.out.println("the coustomercare ="+help);
		return help;
	}
	public short breaks() {
		short total=4;
		System.out.println("the number of breaks="+total);
		return total;
	}
	public boolean bookingsOpen() {
		boolean open=true;
		System.out.println("the advance booking is available="+open);
		return open;
	}
	public double Price() {
		double cost=100000.543267d;
		System.out.println("the price is="+cost);
		return cost;
	}
	public float discount() {
		float drop=1500.500f;
		System.out.println("the discount is="+drop);
		return drop;
	}
	public String bikeName() {
		String name="honda";
		System.out.println("the bike name is="+name);
		return name;
	}
	

}
