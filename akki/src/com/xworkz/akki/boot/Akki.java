package com.xworkz.akki.boot;

public class Akki {
	
	public void akki() {
		try {
			int num=Integer.parseInt("akki");
			System.out.println("print=="+num);
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException"+e);
		}
	}
}
