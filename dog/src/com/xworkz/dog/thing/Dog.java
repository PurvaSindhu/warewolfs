package com.xworkz.dog.thing;

public class Dog {
	public int age;
	
	
	public void main(String[] args) {
		
		
		try {
			age=5;
		}catch (IllegalArgumentException e) {
			System.out.println("they are non existance"+ e);
		}finally {
			System.out.println("they are non existance");
		}
	}
	public static void setAge(int age) {
		if (age<0) {
			throw new IllegalArgumentException("age connot be negative");
		}
	}

}
