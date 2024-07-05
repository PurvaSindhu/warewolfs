package com.xworkz.tamatorice.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector.Characteristics;

public class TamatoRiceRunner {

	public static void main(String[] args) {
		
		Comparator<String> compared = new Comparator<String>() {
			
			@Override
			public int compare(String i, String j) {
				
				Character chara = i.charAt(i.length()-2);
				Character chara2 = j.charAt(j.length()-2);
				//Character character =  Character.valueOf(i.charAt(2));
				//Character character2 =   Character.valueOf(j.charAt(2));
						
						
				return chara.compareTo(chara2);
			}
		};
		
		

		List<String> ghee = new ArrayList<String>();
		ghee.add("tamato");
		ghee.add("masala");
		ghee.add("rice");
		ghee.add("onion");

		Collections.sort(ghee,compared);

		Iterator<String> iterate = ghee.iterator();
		while (iterate.hasNext()) {
			System.out.println("the items needed==" + iterate.next());
		}

	}

}
