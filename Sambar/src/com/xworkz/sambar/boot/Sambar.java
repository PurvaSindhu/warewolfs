package com.xworkz.sambar.boot;

public class Sambar {

	public int quantity;
	public String typeOfSambar;

	public  Sambar(){
		System.err.println("this is default constructor");
	}
	
	public void number(int quantity ) {
		System.out.println("the quantity given is="+quantity);
	}
	
	public void type(String typeOfSambar) {
		System.out.println("the type of sambar given is="+typeOfSambar);
	}
	
}
