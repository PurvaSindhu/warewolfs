package com.xworkz.peanutbutter.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeanutButterRunner {
	
	public static void main(String[] args) {
		
		Comparator<String> compare = new Comparator<String>() {
			
			@Override
			public int compare(String i, String j) {
				Character character = j.charAt(j.length()-7);
				Character character2 = i.charAt(i.length()-7);
				return character.compareTo(character2);
			}
		};
		
		
		
		List <String> list = new ArrayList<String>();
		
		list.add("kissanpeanuts");
		list.add("milkybarflavor");
		list.add("gavuvaFlavour");
		list.add("peanutsNandidi");
		
		Collections.sort(list);
		for (String jam : list) {
			System.out.println(jam);
		}
		
	}

}
