package com.xworkz.mobiles.boot;

import com.xworkz.mobiles.bridge.Samsung;
import com.xworkz.mobiles.things.Laptop;

public class MobileRunner {
	
	public static void main(String [] args) {
		Laptop laptop = new Samsung();
		
		laptop.laptop();
		laptop.capacity();
		laptop.numberOfLaptop();
		laptop.rating();
		laptop.helpLine();
		laptop.price();
		laptop.quality();
		laptop.gst();
		laptop.logo();
		laptop.laptopNmae();
	}

}
