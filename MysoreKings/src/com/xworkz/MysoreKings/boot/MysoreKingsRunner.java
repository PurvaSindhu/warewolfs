package com.xworkz.MysoreKings.boot;

import com.xworkz.MysoreKings.childClass.*;
import com.xworkz.MysoreKings.things.MysoreKings;

public class MysoreKingsRunner {
	
	public static void main(String [] args) {
		MysoreKings mysoreKings = new AdiYadurayaWodeyar();
		MysoreKings mysoreKings2 = new AdiYadurayaWodeyar2();
		
		mysoreKings.name();
		mysoreKings.rulled();
		mysoreKings.sons();
		mysoreKings.period();
		mysoreKings.death();
		
		mysoreKings2.name();
		mysoreKings2.rulled();
		mysoreKings2.sons();
		mysoreKings2.period();
		mysoreKings2.death();
		
	}

}
