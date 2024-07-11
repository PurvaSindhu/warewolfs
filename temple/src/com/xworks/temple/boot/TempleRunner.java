package com.xworks.temple.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworks.temple.dto.TemplesDto;


public class TempleRunner {
	
	public static void main(String[] args) {
		
	
	
	TemplesDto dto = new TemplesDto("krishna temple",500,450,"banglore");
	TemplesDto dto1 = new TemplesDto("ganesh temple",250,200,"ballari");
	TemplesDto dto2 = new TemplesDto("venkateshwara swamy",999,1200,"tirupathi");
	TemplesDto dto3 = new TemplesDto("lakshmi temple",150,200,"kolar");
			
	Comparator<TemplesDto> comp = new Comparator<TemplesDto>() {
		@Override
		public int compare(TemplesDto i, TemplesDto j) {
			if (i.getTicket() > j.getTicket()) {
				return 1;
			}
			return -1;
		}
	};
	
	List<TemplesDto> list = new ArrayList<TemplesDto>(); 
	list.add(dto3);
	list.add(dto2);
	list.add(dto);
	list.add(dto1);
	
	Collections.sort(list,comp);
	
	for (TemplesDto amazon : list) {
		System.out.println(amazon);
	};	
}
}

