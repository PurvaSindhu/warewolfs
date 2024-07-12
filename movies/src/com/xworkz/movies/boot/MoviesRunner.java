package com.xworkz.movies.boot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.movies.dto.MoviesDto;


public class MoviesRunner {
	
	public static void main(String[] args) {
		List<MoviesDto> list = new ArrayList<MoviesDto>();
		list.add(new MoviesDto("NTR", "janvi", "devera", 1500));
		list.add(new MoviesDto("PRABAS", "peepika", "kalki", 555));
		list.add(new MoviesDto("RAM CHARAN", "aliya", "RRR", 999));
		list.add(new MoviesDto("PUNITH", "radika", "james", 756));
		list.add(new MoviesDto("aLLU ARJUN", "samantha", "pushpa", 453));

		List <MoviesDto>ref1 = list.stream().sorted(Comparator.comparingInt(MoviesDto -> MoviesDto.getTicketPrice()))
				.collect(Collectors.toList());
		
		System.out.println("the Movies ticket price is=="+ref1);

	}


}
