package com.xworkz.kettal.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.kettal.Dto.KetttalCollectionDto;

public class KettalRunner {
	
	public static void main(String[] args) {
		KetttalCollectionDto kettal = new KetttalCollectionDto(1, "butterful", "heating", 1000);
		KetttalCollectionDto kettal2 = new KetttalCollectionDto(2, "piogen", "heating", 2000);
		KetttalCollectionDto kettal3 = new KetttalCollectionDto(3, "preethi", "heating", 3000);
		KetttalCollectionDto kettal4 = new KetttalCollectionDto(4, "pristige", "heating",4000);
		KetttalCollectionDto kettal5 = new KetttalCollectionDto(5, "homemade", "heating", 5000);
		
		Collection<KetttalCollectionDto> collection = new ArrayList<KetttalCollectionDto>();
		System.out.println("size=="+collection.size());
		collection.add(kettal);
		collection.add(kettal2);
		collection.add(kettal3);
		collection.add(kettal4);
		collection.add(kettal5);
		collection.add(kettal);
		System.out.println("size=="+collection.size());
		
		for (KetttalCollectionDto dto : collection) {
			System.out.println("the kettal details are given below=="+dto.toString());
		}
		
		collection.remove(kettal5);
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
		collection.removeAll(collection);
		System.out.println(kettal2.toString());
		
	}

}
