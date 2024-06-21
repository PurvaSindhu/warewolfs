package com.xworkz.fruit.thing;

import com.xworkz.fruit.Dto.FruitsDto;

public class FruitsShop {
	
	public void fruits(String name, String appleFruit, int cost, boolean quality) {
		 
		FruitsDto fruit = new FruitsDto();
		
		fruit.setShopName("farmers mart");
		fruit.setApple(appleFruit);
		fruit.setPrice(0);
		fruit.setGoodQuality(true);
		
		fruit.getShopName();
		fruit.getApple();
		fruit.getPrice();
		fruit.isGoodQuality();
	}
	
	public String fruits() {
	FruitsDto fruit = new FruitsDto();
	fruit.getShopName();
	fruit.getApple();
	fruit.getPrice();
	fruit.getShopName();
	
	return "return string";	
	}
	
	public FruitsShop fruits (String name,String frui,int price,boolean open) {
		FruitsDto fruit = new FruitsDto();
		fruit.setShopName(name);
		fruit.setApple(frui);
		fruit.setPrice(price);
		fruit.setShopName(open);
		
		return fruits;
	}

}
