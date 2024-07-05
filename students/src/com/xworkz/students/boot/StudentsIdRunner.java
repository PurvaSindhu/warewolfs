package com.xworkz.students.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentsIdRunner {
	
	public static void main(String[] args) {
		
		Comparator<Integer> comp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i, Integer j) {
				if(j% 10 > i%10) {
					return 1;
				}
				return -1;
			}
		};
		
		List<Integer> id = new ArrayList <Integer> ();
		id.add(345672);
		id.add(976324);
		id.add(478432);
		id.add(664231);
		id.add(116233);
		
		Collections.sort(id,comp);
		for (Integer student :id) {
			System.out.println(student);
		}
	}

}
