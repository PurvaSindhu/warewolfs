package com.xworkz.myntraapp.boot;

import com.xworkz.myntraapp.constants.MyntraAppEnum;

public class MyntraAppRunner {
	
	public static void main(String[] args) {
		MyntraAppEnum appEnum = MyntraAppEnum.WOMEN_DRESSES;
		MyntraAppEnum appEnum2 = MyntraAppEnum.MENS_WEAR;
		MyntraAppEnum appEnum3 = MyntraAppEnum.FOOTWEAR;
		System.out.println("festive wear="+appEnum.getFashion());
		System.out.println("discount="+appEnum.getDiscount());
		System.out.println("daily wear="+appEnum2.getFashion());
		System.out.println("discount="+appEnum2.getDiscount());
		System.out.println("kids wear="+appEnum3.getFashion());
		System.out.println("discount="+appEnum3.getDiscount());
		
		String fashion  = MyntraAppEnum.KIDS_WEAR.getFashion();
		int discount = MyntraAppEnum.KIDS_WEAR.getDiscount();
		System.out.println("fashion="+fashion);
		System.out.println("discount"+discount);
		
		String fashion2 = MyntraAppEnum.BRANDS.getFashion();
		int discount2 = MyntraAppEnum.BRANDS.getDiscount();
		System.out.println("fashion2="+fashion2);
		System.out.println("discount2="+discount2);
	}

}
