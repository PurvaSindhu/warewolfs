package com.xworkz.laptop.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopRunner {
	
	
	public static void main(String[] args) {
		
		Comparator<String> compare = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				Character chara= o1.charAt(o1.length()-4);
				Character chara2= o2.charAt(o2.length()-4);
				return chara2.compareTo(chara);
			}
		};
		
		
		
		List<String> pc = new ArrayList<String>();
		pc.add("dell");
		pc.add("HpUSA");
		pc.add("apple");
		pc.add("lenovo");
		Collections.sort(pc,compare);
		for (String computer : pc) {
			System.out.println(computer);
		}
	}

}
