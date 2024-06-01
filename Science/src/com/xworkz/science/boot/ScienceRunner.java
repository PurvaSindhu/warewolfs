package com.xworkz.science.boot;

import com.xworkz.science.childclass.Biology;
import com.xworkz.science.childclass.Physics;
import com.xworkz.science.things.Science;

public class ScienceRunner {

	public static void main(String [] args) {
		Science science = new Biology();
		Science science2= new Physics();
		
		science.classes();
		science.textBook();
		science.required();
		
		science2.classes();
		science2.textBook();
		science2.required();
	}

}

