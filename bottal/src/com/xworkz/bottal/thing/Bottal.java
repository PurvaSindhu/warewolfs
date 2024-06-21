package com.xworkz.bottal.thing;

public class Bottal {
	int numberOfBottals;
	 String name;
	 
	public void details() {
		 try {
		 String name=null; 
		 System.out.println(name.charAt(5));
		 }catch(NullPointerException e) {
			 System.out.println("NullPointerException=="+e);
		 }
		 finally {
		 System.out.println(numberOfBottals);
		 }
	 }

}