package com.xworkz.idly.boot;

public class Idly {
	
	public int numberOfIdly;
	public String typeOfIdly;

	public  Idly(){
		System.err.println("this is default constructor");
	}
	
	public void number(int numberOfIdly) {
		System.out.println("the number of idly given is="+numberOfIdly);
	}
	
	public void type(String typeOfIdly) {
		System.out.println("the number of idly given is="+typeOfIdly);
	}
	
}
