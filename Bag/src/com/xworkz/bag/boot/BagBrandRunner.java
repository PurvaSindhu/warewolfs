package com.xworkz.bag.boot;

import com.xworkz.bag.things.AmericanTourister;

public class BagBrandRunner {
	

	public static void main(String args[]) {
		AmericanTourister americantourister = new AmericanTourister();
		System.out.println("this is runner class");
		AmericanTourister american =new AmericanTourister();
		AmericanTourister america =new AmericanTourister();
		
		american.setbagsSelledPerDay(22);
		american.setbrandName("wild craft");
		america.setinfo(22);
		america.setinfo2("good");
		americantourister.setdetails("web site adress");
		americantourister.setcontactInfo(123456788);
		
	}
}
