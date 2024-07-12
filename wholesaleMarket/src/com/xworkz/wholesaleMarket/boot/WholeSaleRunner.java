package com.xworkz.wholesaleMarket.boot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.wholesaleMarket.dto.WholeSaleMarketDto;

public class WholeSaleRunner {

	public static void main(String[] args) {
		List<WholeSaleMarketDto> list = new ArrayList<WholeSaleMarketDto>();
		list.add(new WholeSaleMarketDto("vegetables", "fresh", 600, 10));
		list.add(new WholeSaleMarketDto("spices", "good", 400, 15));
		list.add(new WholeSaleMarketDto("dresses", "good", 1000, 5));
		list.add(new WholeSaleMarketDto("nuts", "good", 250, 1));
		list.add(new WholeSaleMarketDto("household", "good", 700, 1));

		List <WholeSaleMarketDto>ref1 = list.stream().sorted(Comparator.comparing(WholeSaleMarketDto -> WholeSaleMarketDto.getWholesale()))
				.collect(Collectors.toList());
		
		System.out.println("the WholeSaleMarket price is=="+ref1);

	}

}
