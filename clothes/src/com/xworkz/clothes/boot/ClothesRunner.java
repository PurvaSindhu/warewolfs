package com.xworkz.clothes.boot;

import java.util.Arrays;
import java.util.List;

public class ClothesRunner {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6,10,9,22,44,77,33,27,18);
		list.forEach(n -> System.out.println("array = " + n));

		System.out.println("After filter==");

		list.stream().sorted().filter(n -> n % 2 == 0).forEach(n -> System.out.println("array : " + n));

	}

}
