package com.xworkz.bodywash.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.bodywash.dto.BodyWashDto;

public class BodyWashRunner {
	
	public static void main(String[] args) {
		String name = "fiama";
		String name2= "nivea";
		String name3= "pears";
		String name4="lux";
		String name5="biotique";
		String name6="yardley";
		String name7="mcaffine";
		String name8="body clear";
		String name9="love beauty";
		String name10="mamaearth";
		
		BodyWashDto washDto = new BodyWashDto(1, "nivea", "fresh lily", "moisturisor");
		BodyWashDto washDto2 = new BodyWashDto(2, "dove", "rose", "moisturisor");
		BodyWashDto washDto3 = new BodyWashDto(3, "himayalyan", "arcade", "moisturisor");
		BodyWashDto washDto4 = new BodyWashDto(4, "santoor", "lily", "moisturisor");
		
		Collection <BodyWashDto> bodyWash = new ArrayList<BodyWashDto>();
		System.out.println(bodyWash.size());
		bodyWash.add(washDto4);
		bodyWash.add(washDto3);
		bodyWash.add(washDto2);
		bodyWash.add(washDto);
		System.out.println(bodyWash.size());
		bodyWash.remove(washDto4);
		System.out.println(bodyWash.size());
		
		Iterator <BodyWashDto> clean = bodyWash.iterator();
		while (clean.hasNext()) {
			System.out.println("the details are=="+clean.next());
		}
		if (bodyWash.isEmpty()==true) {
			System.out.println("the is no info");
		}else {
			System.out.println("there is info abt the product");
		}
		
		bodyWash.clear();
		System.out.println(bodyWash.size());
		
		 
		
		Collection <String> names = new ArrayList<String>();
		names.size();
		names.add(name10);
		names.add(name9);
		names.add(name8);
		names.add(name7);
		names.add(name6);
		names.add(name5);
		names.add(name4);
		names.add(name3);
		names.add(name2);
		names.add(name);
		System.out.println(names.size());
		names.remove(name5);
		System.out.println(names.size());
		
		Iterator <String> dto = names.iterator();
		while (dto.hasNext()) {
			System.out.println("the other names are=="+dto.next());
		}
		if (names.isEmpty()==true) {
			System.out.println("the names arent present");
		}else {
			System.out.println("the other product names are present");
		}
		
		names.clear();
		System.out.println(names.size());
		
	}
	

}
