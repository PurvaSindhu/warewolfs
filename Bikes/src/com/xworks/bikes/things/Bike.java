package com.xworks.bikes.things;

public interface Bike {
	
	default void bike() {
		System.out.println("this is bike void");
	}
	default int numberOftyres() {
		int tyre=2;
		System.out.println("the number of tyres are="+tyre);
		return tyre;
	}
	default char indentity() {
		char logo='p';
		System.out.println("the logo is="+logo);
		return logo;
	}
	default byte numberOfGears() {
		byte gears=100;
		System.out.println("the number of gears are="+gears);
		return gears;
	}
	default long costumerCare() {
		long help=9876654321l;
		System.out.println("the coustomercare ="+help);
		return help;
	}
	default short breaks() {
		short total=4;
		System.out.println("the number of breaks="+total);
		return total;
	}
	default boolean bookingsOpen() {
		boolean open=true;
		System.out.println("the advance booking is available="+open);
		return open;
	}
	default double Price() {
		double cost=100000.543267d;
		System.out.println("the price is="+cost);
		return cost;
	}
	default float discount() {
		float drop=1500.500f;
		System.out.println("the discount is="+drop);
		return drop;
	}
	default String bikeName() {
		String name="honda";
		System.out.println("the bike name is="+name);
		return name;
	}
	

}
