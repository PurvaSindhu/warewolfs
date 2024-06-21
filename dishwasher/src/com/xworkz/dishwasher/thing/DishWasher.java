package com.xworkz.dishwasher.thing;

public class DishWasher {
	
	public int cost=10000;
	public int emi=0;
	
	public void price() {
		try { 
		 emi=cost/0;
		 System.out.println("the emi of the dishwasher is="+emi);
		}catch(ArithmeticException e) {
			System.out.println("there is a problem with emi");	
		}
		finally {
			System.out.println("the end of the program");
		}
	}

}
