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
		
		
		System.out.println("instance class");
		System.out.println(american instanceof AmericanTourister);
		System.out.println(america instanceof AmericanTourister);
		System.out.println("this is string to string class");
		System.out.println(american.toString());
		System.out.println(america.toString());
		System.out.println("equals to");
		System.out.println(american.equals(american));
		System.out.println(america.equals(america));
		System.out.println("hashCode ");
		System.out.println(american.hashCode());
		System.out.println(america.hashCode()); 
		System.out.println("equals to");
		System.out.println(american.equals(america));
		System.out.println(america.equals(american));
	}
}
