package com.xworkz.television.boot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.television.dto.TelevisionDto;



public class TeleVisionRunner {
	
	public static void main(String[] args) {
		List<TelevisionDto> list = new ArrayList<TelevisionDto>();
		list.add(new TelevisionDto("friends", "rrr", 25000, 1500));
		list.add(new TelevisionDto("horror", "simhadhri", 20000, 2123));
		list.add(new TelevisionDto("comedy", "student no1", 1000, 621));
		list.add(new TelevisionDto("reels", "adhurs", 1000, 1214));
		list.add(new TelevisionDto("greeks", "jai lava kusha", 765, 427));

		List <TelevisionDto>ref1 = list.stream().sorted(Comparator.comparing(TelevisionDto -> TelevisionDto.getMovies()))
				.collect(Collectors.toList());
		
		System.out.println("the tv movies are=="+ref1);

	}


}
