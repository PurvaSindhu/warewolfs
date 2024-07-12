package com.xworkz.wire.boot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.wire.dto.WireDto;

public class WireRunner {
	
	
	public static void main(String[] args) {
		List <WireDto> list = new ArrayList<WireDto>();
		list.add(new WireDto("finolex","good",5,1));
		list.add(new WireDto("anchor","good",5,1));
		list.add(new WireDto("polycab","good",5,1));
		list.add(new WireDto("havels","good",5,1));
		list.add(new WireDto("asian","good",5,1));
		
		List<WireDto> ref1 = list.stream().sorted(Comparator.comparingInt(WireDto ->  WireDto.getDurability() )).collect(Collectors.toList());
		
		System.out.println("the details are=="+ref1);
		
	
	}

}
