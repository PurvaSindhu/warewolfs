package com.xworkz.bike.thing;

public class Bike {
	
	String name="yamaha 125CCH blue";
	
	public void bike() {
		try {
		char colour=name.charAt(20);
		System.out.println("the exception is"+colour);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException=="+e);
		}
	}

}
