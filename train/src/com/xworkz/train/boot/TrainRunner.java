package com.xworkz.train.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.xworkz.train.dto.TrainDto;

public class TrainRunner {

	public static void main(String[] args) {
		
		
		
		TrainDto dto = new TrainDto("mysore",2,6,"banglore");
		TrainDto dto1 = new TrainDto("kerala",4,9,"ballari");
		TrainDto dto2 = new TrainDto("banglore",11,6,"udupi");
		TrainDto dto3 = new TrainDto("delhi",1,10,"kolar");
				
		Comparator<TrainDto> comp = new Comparator<TrainDto>() {
			@Override
			public int compare(TrainDto j, TrainDto i) {
				
				return j.getDropPoint().compareTo(i.getDropPoint());
			}
		};
		
		List<TrainDto> list = new ArrayList<TrainDto>(); 
		list.add(dto3);
		list.add(dto2);
		list.add(dto);
		list.add(dto1);
		
		Collections.sort(list,comp);
		
		for (TrainDto sleeper: list) {
			System.out.println(sleeper);
		};	
	}
	}