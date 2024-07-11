package com.xworkz.subjects.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SubjectRunner {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("science","maths","english","kannada");
		//list.stream().sorted().filter(n -> n+1).forEach(n -> System.out.println("array==="+n));
		//list.stream().sorted().filter(n -> n % 2 == 0).forEach(n -> System.out.println("array : " + n));
		List<String> ref1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> ref2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("ref1=="+ref1);
		System.out.println("ref2=="+ref2);
		
		List <String> list2 = Arrays.asList("english","hindi","france","korean","japanese");
		list2.stream().sorted();
		
	}

}
