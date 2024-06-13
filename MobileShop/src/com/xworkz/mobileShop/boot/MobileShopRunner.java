package com.xworkz.mobileShop.boot;

import com.xworkz.mobileShop.thing.MobileShop;

public class MobileShopRunner {
	
	public static void main(String [] args) {
		MobileShop shop =new MobileShop();
		
		shop.details("iphone","vivo","realme","oneplus","samsung",125,20000,50000,false,"shrelly");
		
	}

}
