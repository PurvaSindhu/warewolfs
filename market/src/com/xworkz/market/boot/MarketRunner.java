package com.xworkz.market.boot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.market.dto.MarketDto;


public class MarketRunner {
	
	public static void main(String[] args) {
		List<MarketDto> list = new ArrayList<MarketDto>();
		list.add(new MarketDto("potato", "apple", 600, 10));
		list.add(new MarketDto("beetroot", "orange", 400, 15));
		list.add(new MarketDto("ladiesFinger", "papaya", 1000, 5));
		list.add(new MarketDto("amala", "grapes", 250, 1));
		list.add(new MarketDto("carrot", "banana", 700, 1));

		List <MarketDto>ref1 = list.stream().sorted(Comparator.comparing(MarketDto -> MarketDto.getVegetables()))
				.collect(Collectors.toList());
		
		System.out.println("the Market price is=="+ref1);

	}


}
