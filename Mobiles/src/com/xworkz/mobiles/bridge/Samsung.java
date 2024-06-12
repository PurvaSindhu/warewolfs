package com.xworkz.mobiles.bridge;

import com.xworkz.mobiles.things.Laptop;


public class Samsung implements Laptop{
	
	public void charger() {
		
	}
	public void laptop() {
		System.out.println("this is void ");
	}

	public int numberOfLaptop() {
		int number = 10;
		System.out.println("this ia a deafult method" + number);
		return number;
	}

	public byte capacity() {
		byte storage = 120;
		System.out.println("the capacity of this is=" + storage);
		return storage;
	}

	public short rating() {
		short stars = 10;
		System.out.println("the rating is=" + stars);
		return stars;
	}

	public long helpLine() {
		long coustmerHelpLine = 1234556778l;
		System.out.println("the help line number is"+coustmerHelpLine);
		return coustmerHelpLine;
	}

	public char logo() {
		char symbol = 'd';
		System.out.println("the logo of computer is=" + symbol);
		return symbol;
	}

	public boolean quality() {
		boolean product = true;
		System.out.println("the quality is=" + product);
		return product;
	}

	public double price() {
		double cost = 50000.132456789d;
		System.out.println("the price of computer is=" + cost);
		return cost;
	}

	public float gst() {
		float cgst = 1200.12435f;
		System.out.println("the gst of the laptop is=" + cgst);
		return cgst;
	}

	public String laptopNmae() {
		String name = "Dell";
		System.out.println("the of laptop is="+name);
		return name;
	}

	

}
