package com.xworkz.nationalparks.constants;

public enum NationalParksEnum {

	NAGARAHOLE_TIGER_RESERVE("TIGER RESERVE", 1987), BANDIPUR_NATIONAL_PARK("INDIAN JACKEL", 1974),
	ANSHI_NATIONAL_PARK("GREAT HORNBILL", 1987), BHADRA_WILDLIFE_SANCTUARY("TIGERS", 2000),
	BANNERGHATTA_NATIONAL_PARK("ELEPHANTS", 1987);
	
	private String animal;
	private int startedIn;

	NationalParksEnum(String animal, int startedIn) {
		this.animal =animal;
		this.startedIn = startedIn;
	}

	public String getAnimal() {
		return animal;
	}
	public int getStartedIN() {
		return startedIn;
	}

	

}
