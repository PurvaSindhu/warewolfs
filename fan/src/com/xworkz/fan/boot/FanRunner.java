package com.xworkz.fan.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FanRunner {
	
	public static void main(String[] args) {
		
		Comparator<Integer> compare = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i, Integer j) {
				//Integer into = Integer.valueOf(i)-1;
				//Integer into2 = Integer.valueOf(j)-1;
				
				Integer k;
				k=i/j;
				if (j>i) {
					return -1;
				}else if (j<i) {
					return 1;
				}else {
					return 0;
				}
			}
		};
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2469);
		list.add(9132);
		list.add(7561);
		list.add(3104);
		list.add(1327);
		Collections.sort(list,compare);
		for (Integer fan : list) {
			System.out.println(fan);
		}
	};
}
