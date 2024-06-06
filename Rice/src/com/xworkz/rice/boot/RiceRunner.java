package com.xworkz.rice.boot;

import com.xworkz.rice.childclass.TamatoRice;
import com.xworkz.rice.thing.Rice;

public class RiceRunner {
	
	public static void main(String [] args) {
		TamatoRice rice = new TamatoRice();
		rice.type("tamato");
		rice.type("tamato",21);
	}

}
