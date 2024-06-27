package com.xworkz.bucket.thing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Bucket {
	
	public static void main(String[] args) {
		String brand1="homesafe";
		String quality="good";
		String brand2="dmart";
		String shopName="ikaea store";
				
		Collection <String> collection = new ArrayList<String>();
		System.out.println(collection.size());
		collection.add(shopName);
		collection.add(quality);
		collection.add(brand2);
		collection.add(brand1);
		
		Iterator<String> iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println("the details are"+iterator.next());
		}
			
		System.out.println(collection.size());
		System.out.println(collection.remove(brand1));
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
		
	}

}
