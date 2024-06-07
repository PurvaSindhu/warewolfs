package com.xworkz.perfumes.boot;

import com.xworkz.perfumes.things.Perfumes;

public class PerfumesRunner {
	
	public static void main(String [] args) {
		Object obj = new Object();
		Perfumes perfumes = new Perfumes();
		System.out.println("this is a runner class");
		Perfumes perfumes1 = new Perfumes (10,"mall","gucci","jenniferAniston","yardley","fantasy","zudio");
		Perfumes perfumes2 = new Perfumes ("denver","zara","carltonLandon","afforable",1000,5000,10,10000);
		
		perfumes.setstoreName("gucci store");
		perfumes1.setprice(2500);
		perfumes1.setrange(10000);
		perfumes2.setrating(9);
		perfumes2.setinStock(100);
		perfumes.getstoreName();
		perfumes1.getprice();
		perfumes1.getrange();
		perfumes2.getrating();
		perfumes2.getinStock();
		

		System.out.println(perfumes1 instanceof Perfumes);
		System.out.println(perfumes2 instanceof Perfumes);
		System.out.println(perfumes instanceof Perfumes);
		System.out.println("to string");
		System.out.println(perfumes1.toString());
		System.out.println(perfumes2.toString());
		System.out.println("equals to");
		System.out.println((perfumes1).equals(perfumes1));
		System.out.println((perfumes2).equals(perfumes2));
		System.out.println("hashCode");
		System.out.println(perfumes1.hashCode());
		System.out.println(perfumes2.hashCode());
		System.out.println("equals to");
		System.out.println(perfumes1.equals(perfumes2));
		System.out.println(obj.equals(perfumes));
		
		
	}
	
}
