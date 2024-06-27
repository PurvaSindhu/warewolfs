package com.xworkz.shoes.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.shoes.dto.ShoesDto;

public class ShoesRunner {
	
	public static void main(String[] args) {
		
		ShoesDto dto = new ShoesDto("six","walkmate","pepwalk","silly walk");
		ShoesDto dto1 = new ShoesDto("six","walkmate","pepwalk","silly walk");
		ShoesDto dto2 = new ShoesDto("six","walkmate","pepwalk","silly walk");
		ShoesDto dto3 = new ShoesDto("six","walkmate","pepwalk","silly walk");
		
		Collection <ShoesDto> shoes = new ArrayList<ShoesDto>();
		System.out.println(shoes.size());
		shoes.add(dto3);
		shoes.add(dto2);
		shoes.add(dto1);
		shoes.add(dto);
		
		
		Iterator <ShoesDto> shoe = new Iterator<ShoesDto>() {
			while (ShoesDto details : shoes) {
				
			}
				
		};
}
}
