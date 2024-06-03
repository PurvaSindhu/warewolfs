package com.xworkz.footwear.childclass;

import com.xworkz.footwear.things.FootWear;

public class FilpFlops extends FootWear {
	public int prices=1000;
	public String type="casual shoes";
	public char colour='w';
	

	public void price() {
		System.out.println("the price of the shoes is"+prices);
	}
	
	public void modal() {
		System.out.println("the modal number is"+type);
	}
	
	public void quality() {
		System.out.println("the quality "+colour);
	}

}
