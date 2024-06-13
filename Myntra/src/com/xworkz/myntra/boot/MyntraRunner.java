package com.xworkz.myntra.boot;

import com.xworkz.myntra.things.MyntraOrderDetails;

public class MyntraRunner {
	
	public static void main(String [] args) {
		
		MyntraOrderDetails orders= new MyntraOrderDetails();
		
		orders.info(21,100,1000,"myntra","mynthra@gmail.com",45678990231l,50,1552,"mama earth","50% off");
	
	}

}
