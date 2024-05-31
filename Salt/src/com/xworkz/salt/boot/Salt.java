package com.xworkz.salt.boot;

public class Salt {
	
	public int numberOfPacks;
	public String brandName;

	public Salt() {
		System.out.println("this is default constructor");
	}
	
	public void number(int numberOfPacks) {
		System.out.println("the number packets persent are="+numberOfPacks);
	}
	
	public void name(String brandName) {
		System.out.println("the brand of salt is="+brandName);
	}

}
