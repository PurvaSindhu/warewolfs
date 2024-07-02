package com.xworkz.myntraapp.constants;

public enum MyntraAppEnum {

	WOMEN_DRESSES("ethnic wear", 10), MENS_WEAR("Jeans", 50), KIDS_WEAR("kids wear", 5),
	BRANDS("high end collection", 30), FOOTWEAR("Latest modals", 20);

	private String fashion;
	private int discount;

	MyntraAppEnum(String fashion, int discount) {
		this.fashion = fashion;
		this.discount = discount;
	}

	public String getFashion() {
		return fashion;
	}

	public int getDiscount() {
		return discount;
	}

}
