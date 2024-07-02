package com.xworkz.nationalparks.boot;

import com.xworkz.nationalparks.constants.NationalParksEnum;

public class NationalParksRunner {
	
	public static void main(String[] args) {
		String name = NationalParksEnum.NAGARAHOLE_TIGER_RESERVE.getAnimal();
		int start = NationalParksEnum.NAGARAHOLE_TIGER_RESERVE.getStartedIN();
		
		String name2 = NationalParksEnum.BANNERGHATTA_NATIONAL_PARK.getAnimal();
		int start2 = NationalParksEnum.BANNERGHATTA_NATIONAL_PARK.getStartedIN();
		
		String name3 = NationalParksEnum.BANDIPUR_NATIONAL_PARK.getAnimal();
		int start3 = NationalParksEnum.BANDIPUR_NATIONAL_PARK.getStartedIN();
	
		String name4 = NationalParksEnum.ANSHI_NATIONAL_PARK.getAnimal();
		int start4 = NationalParksEnum.ANSHI_NATIONAL_PARK.getStartedIN();
		System.out.println("place name="+name4);
		System.out.println("started="+start4);
		
		String name5 = NationalParksEnum.BHADRA_WILDLIFE_SANCTUARY.getAnimal();
		int start5 = NationalParksEnum.BHADRA_WILDLIFE_SANCTUARY.getStartedIN();
		
		
		System.out.println("place name="+name);
		System.out.println("started="+start);
		System.out.println("place name="+name2);
		System.out.println("started="+start2);
		System.out.println("place name="+name3);
		System.out.println("started="+start3);
		System.out.println("place name="+name4);
		System.out.println("started="+start4);
		System.out.println("place name="+name5);
		System.out.println("started="+start5);
		
		
		
	}
	

}
