package com.xworkz.chocolate.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.chocolate.dto.ChocolateDto;


public class ChocolateRunner {
	
	public static void main(String[] args) {
		ChocolateDto dto = new ChocolateDto("suhas", "ball", "chocobar",42537);
		ChocolateDto dto1 = new ChocolateDto("krishna", "ball", "milkybar", 3241);
		ChocolateDto dto2 = new ChocolateDto("vali", "ball", "dairymilk", 5243);
		ChocolateDto dto3 = new ChocolateDto("rama", "ball", "munch", 16722);
				
		Comparator<ChocolateDto> comp = new Comparator<ChocolateDto>() {
			@Override
			public int compare(ChocolateDto o1, ChocolateDto o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		};
		
		List<ChocolateDto> list = new ArrayList<ChocolateDto>(); 
		list.add(dto3);
		list.add(dto2);
		list.add(dto);
		list.add(dto1);
		
		Collections.sort(list,comp);
		
		for (ChocolateDto choco : list) {
			System.out.println(choco);
		};	
	}
}