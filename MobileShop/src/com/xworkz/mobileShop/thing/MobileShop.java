package com.xworkz.mobileShop.thing;

import com.xworkz.mobileShop.dto.BrandsDto;

public class MobileShop {

	public void details(String iOS, String andriod, String android2, String android3, String android4, int number,
			int profits, int cost,boolean isOpened,String name) {
		
		BrandsDto brand =new BrandsDto();
		
		brand.setiPhone("iphone");
		brand.setSamgung("samsung");
		brand.setVivo("vivo");
		brand.setRealMe("realme");
		brand.setOnePlus("onePlus");
		brand.setNumberOfPhones(100);
		brand.setProfit(10000);
		brand.setPrice(50000);
		brand.setStoreOpened(true);
		brand.setStoreName("splash store");
		
		brand.getiPhone();
		brand.getSamgung();
		brand.getVivo();
		brand.getRealMe();
		brand.getOnePlus();
		brand.getNumberOfPhones();
		brand.getProfit();
		brand.getPrice();
		brand.isStoreOpened();
		brand.getStoreName();

	}

}
