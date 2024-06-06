package com.xworkz.hotal.boot;

import com.xworkz.hotal.things.Hotal;
import com.xworkz.perfumes.things.Perfumes;

public class HotalRunner {
	
	public static void main (String [] args) {
		Object obj=new Object();
		Hotal restro = new Hotal();
		System.out.println("this is a runner class");
		Hotal restro1 = new Hotal(2,3,"vada","sambar","tamato rice","palav","dosa");
		Hotal restro2 = new Hotal("coconut","good",150,20,10,5,"banglore","udapi addithya");
		
		restro1.setmasalaDosa("masala dosa");
		restro1.setrating(5);
		restro1.setprice(200);
		restro.sethotalName("hotal daba");
		restro2.setsambar("bele samber");
		restro1.getmasalaDosa();
		restro1.getrating();
		restro1.getprice();
		restro.gethotalName();
		restro2.getsambar();
		
		System.out.println(restro1 instanceof Hotal);
		System.out.println(restro2 instanceof Hotal);
		System.out.println(restro instanceof Hotal);
		System.out.println("to string");
		System.out.println(restro1.toString());
		System.out.println(restro2.toString());
		System.out.println("equals to");
		System.out.println((restro1).equals(restro1));
		System.out.println((restro2).equals(restro2));
		System.out.println("hashCode");
		System.out.println("equals to");
		System.out.println(restro1.equals(restro1));
		System.out.println(obj.equals(restro));
		
		
	}

}