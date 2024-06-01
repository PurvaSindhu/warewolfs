package com.xworkz.science.childclass;

import com.xworkz.science.things.Science;

public class Biology extends Science{
	
	protected String name="biology book";
	protected int book=10;
	protected int number=60;
	

	public void classes () {
		System.out.println("the class name is"+name);
	}
	
	public void textBook() {
		System.out.println("this is --- class book");
	}
	
	public void required() {
		System.out.println("the number of books required are="+number);
	}

}
