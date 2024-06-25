package com.xworkz.chairs.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.chairs.Dto.ChairCollectionDto;

public class ChairRunner {
	public static void main(String[] args) {
		ChairCollectionDto dto = new ChairCollectionDto(5,"royalock",1000, true);
		ChairCollectionDto dto2 = new ChairCollectionDto(4,"homelock",600, false);
		ChairCollectionDto dto3 = new ChairCollectionDto(2,"ikea",500, true);
		ChairCollectionDto dto4 = new ChairCollectionDto(6,"homebuy",700, false);
		ChairCollectionDto dto5 = new ChairCollectionDto(3,"furniture",900, true);
		
		Collection<ChairCollectionDto> collection = new ArrayList<ChairCollectionDto>();
		System.out.println("size=="+collection.size());
		collection.add(dto);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		for (ChairCollectionDto chairDto : collection) {
			System.out.println("the chair collection=="+chairDto.toString());
			}
		System.out.println("size=="+collection.size());
		collection.remove(dto3);
		System.out.println("size=="+collection.size());
		collection.clear();
		System.out.println("size=="+collection.size());
	}

}
