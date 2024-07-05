package com.xworkz.amazon.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.amazon.dto.AmazonOrderDto;

public class AmazonRunner {

	public static void main(String[] args) {
		AmazonOrderDto dto = new AmazonOrderDto("suhas", "ball", 100, 2516);
		AmazonOrderDto dto1 = new AmazonOrderDto("krishna", "ball", 100, 3241);
		AmazonOrderDto dto2 = new AmazonOrderDto("vali", "ball", 100, 5243);
		AmazonOrderDto dto3 = new AmazonOrderDto("rama", "ball", 100, 16722);
				
		Comparator<AmazonOrderDto> comp = new Comparator<AmazonOrderDto>() {
			@Override
			public int compare(AmazonOrderDto o1, AmazonOrderDto o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		};
		
		List<AmazonOrderDto> list = new ArrayList<AmazonOrderDto>(); 
		list.add(dto3);
		list.add(dto2);
		list.add(dto);
		list.add(dto1);
		
		Collections.sort(list,comp);
		
		for (AmazonOrderDto amazon : list) {
			System.out.println(amazon);
		};	
	}
}

