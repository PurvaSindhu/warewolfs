package com.xworkz.dal.boot;

import com.xworkz.dal.childclass.BisiBeleBath;
import com.xworkz.dal.things.Dall;

public class DalRunner {
	
	public static void main(String [] args) {
		Dall dall = new BisiBeleBath();
		dall.details(1);
		dall.details(10,"double horse");
	}

}
