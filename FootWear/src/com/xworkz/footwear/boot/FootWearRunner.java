package com.xworkz.footwear.boot;

import com.xworkz.footwear.childclass.Shoes;
import com.xworkz.footwear.things.FootWear;
import com.xworkz.footwear.childclass.FilpFlops;


public class FootWearRunner {

	public static void main(String [] args) {
		FootWear footwaer = new Shoes ();
		FootWear footwear = new FilpFlops();
		
		footwaer.price();
		footwaer.modal();
		footwaer.quality();
		footwear.price();
		footwear.modal();
		footwear.quality();
	}
}
