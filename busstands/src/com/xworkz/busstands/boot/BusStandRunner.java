package com.xworkz.busstands.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.busstands.dto.BusStandDto;



public class BusStandRunner {
	
public static void main(String[] args) {
		
		
		
		BusStandDto dto = new BusStandDto("kempegouda","majestic","banglore","karnataka");
		BusStandDto dto1 = new BusStandDto("old bustand","gandi nagar","karnataka","ballari");
		BusStandDto dto2 = new BusStandDto("nagashree","tirumala","andhra","tirupathi");
		BusStandDto dto3 = new BusStandDto("vrl","chenni","kashmere gate","kolar");
				
		Comparator<BusStandDto> comp = new Comparator<BusStandDto>() {
			@Override
			public int compare(BusStandDto i, BusStandDto j) {
				
				
				return i.getLocation().compareTo(j.getLocation());
			}
		};
		
		List<BusStandDto> list = new ArrayList<BusStandDto>(); 
		list.add(dto3);
		list.add(dto2);
		list.add(dto);
		list.add(dto1);
		
		Collections.sort(list,comp);
		
		for (BusStandDto stand : list) {
			System.out.println(stand);
		};	
	}
	}

