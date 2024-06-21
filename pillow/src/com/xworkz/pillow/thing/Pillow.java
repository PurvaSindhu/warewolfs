package com.xworkz.pillow.thing;

public class Pillow {
	public static void print(int number) {
	    if (number>=18){
			System.out.println("the number of pillows are available");
	    }else {
			throw new IllegalArgumentException("IllegalArgumentException ");
			} 
		}	
	}


