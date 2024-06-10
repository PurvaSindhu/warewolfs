package com.xworkz.mosquitoRepelent.boot;

import com.xworkz.mosquitoRepelent.childclass.*;
import com.xworkz.mosquitoRepelent.things.MosquitoRepelent;

public class RepelantRunner {

	public static void main(String [] args) {
		MosquitoRepelent mosquitoRepelent = new GoodNight();
		MosquitoRepelent mosquitoRepelent1 = new AllOut();
		
		mosquitoRepelent.name();
		mosquitoRepelent.kills();
		mosquitoRepelent.behavior();
		mosquitoRepelent.breed();
		mosquitoRepelent.food();
		
		mosquitoRepelent1.name();
		mosquitoRepelent1.kills();
		mosquitoRepelent1.behavior();
		mosquitoRepelent1.breed();
		mosquitoRepelent1.food();
	}

}
