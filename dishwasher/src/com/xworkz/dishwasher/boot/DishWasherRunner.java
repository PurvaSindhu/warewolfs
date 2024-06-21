package com.xworkz.dishwasher.boot;

import com.xworkz.dishwasher.thing.DishWasher;

public class DishWasherRunner {
	
	public static void main(String[] args) {
		DishWasher washer = new DishWasher();
		washer.price();
	}

}
