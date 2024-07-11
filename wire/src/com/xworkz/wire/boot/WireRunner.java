package com.xworkz.wire.boot;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.wire.dto.WireDto;

public class WireRunner implements  Comparator<WireDto> {
	
	
	public static void main(String[] args) {
		
		WireDto dto = new WireDto(null, null, 0, 0);
		List <WireDto> list = Arrays.asList(new WireDto("finolex","good",5,2),new WireDto("polycab","good",10,2),
				new WireDto("havells","good",3,2),
				new WireDto("sterlite","good",5,1),
				new WireDto("anchor","good",5,2));
		list.stream().sorted();
		
		System.out.println("list=="+list);
		
	}

	@Override
	public int compare(WireDto i, WireDto j) {
		if (i.getDurability() > j.getDurability()) {
			return 1;
		}else if (i.getDurability() < j.getDurability()) {
			return 0;
		}
		
		return -1;
	}


}
