package com.xworkz.clothes.boot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClothsRunner {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6,10,9,22,44,77,33,27,18);
		list.forEach(n -> System.out.println("array = " + n));
		
		
		
		System.out.println("After filter==");

		
		List<Integer> list2 =Arrays.asList(10,50,44,78,90,32,21);
		list2.forEach(n -> System.out.println("array = " + n));
		 List ref1= list2.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		 
		 System.out.println("ref1=="+ref1);
		
		
	}
	
	

}
