package com.xworkz.bus.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.bus.dto.BusDto;


public class BusRunner {
	
	public static void main(String[] args) {
		
		
		
		BusDto dto = new BusDto("abhi bus",6,450,"banglore");
		BusDto dto1 = new BusDto("red bus",5,200,"ballari");
		BusDto dto2 = new BusDto("nagashree",9,1200,"tirupathi");
		BusDto dto3 = new BusDto("vrl",7,200,"kolar");
				
		Comparator<BusDto> comp = new Comparator<BusDto>() {
			@Override
			public int compare(BusDto i, BusDto j) {
				if (i.getArrival() > j.getArrival()) {
					return 1;
				}
				return -1;
			}
		};
		
		List<BusDto> list = new ArrayList<BusDto>(); 
		list.add(dto3);
		list.add(dto2);
		list.add(dto);
		list.add(dto1);
		
		Collections.sort(list,comp);
		
		for (BusDto bus : list) {
			System.out.println(bus);
		};	
	}
	}

