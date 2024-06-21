package com.xworkz.soaps.things;

public class Soaps {
	
	public String names[]= {"dove","santhoor","chinthol","medimix"};
	
	public void brands() {
		System.out.println(names[0]);
		try {
		System.out.println("the number of soaps ="+names[4]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("there are onlt four types available");
		}
		finally {
			System.out.println("currently unavailable");
		}
	}

}
