package com.xworkz.age.thing;

public class AgeOfPerson {
	
	public static void main(String[] args) {
	
	try {
		Object obj = new Integer(50);
		String str = (String) obj;
	}catch(ClassCastException e) {
		System.out.println("ClassCastException"+e);
	}finally {
		System.out.println("this is finally");
	}
}
}
